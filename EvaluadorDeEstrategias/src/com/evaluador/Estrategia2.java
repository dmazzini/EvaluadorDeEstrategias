package com.evaluador;

import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Estrategia2 extends Estrategia {

	private Acciones acciones;

	public Estrategia2(Acciones acciones) {
		this.acciones = acciones;
	}

	@Override
	public boolean decidirCompra(String accion, DateTime fecha) {
		Double cotizacionActual = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Double cotizacionDiaAnterior = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha.minusDays(1));
		double delta = cotizacionActual - cotizacionDiaAnterior;
		
		double porcentaje = (delta/cotizacionDiaAnterior)*100;
		return (Math.signum(porcentaje) < 0) && (Math.abs(porcentaje) >= 1.0);
	}

	@Override
	public boolean decidirVenta(String accion, DateTime fecha) {
		
		DateTime fechaCompra = acciones.fechaDeAccionMasAntigua(accion);
		
		return fechaCompra != null && (Days.daysBetween(fechaCompra, fecha).getDays() >= 5);
	}

}
