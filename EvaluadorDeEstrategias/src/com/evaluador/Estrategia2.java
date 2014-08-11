package com.evaluador;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Estrategia2 extends Estrategia {

	@Override
	public boolean decidirCompra(String accion, DateTime fecha) {
		Double cotizacionActual = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Double cotizacionDiaAnterior = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha.minusDays(1));
		double delta = cotizacionActual - cotizacionDiaAnterior;
		
		double porcentaje = (delta/cotizacionDiaAnterior)*100;
		return (Math.signum(porcentaje) < 0) && (Math.abs(porcentaje) >= 1.0);
	}

	@Override
	public boolean decidirVenta(String accion, Acciones acciones, DateTime fecha) {
		
		DateTime fechaCompra = acciones.fechaDeAccionMasAntigua(accion);
		
		return fechaCompra != null && (Days.daysBetween(fechaCompra, fecha).getDays() >= 5);
	}

	@Override
	public String toString() {
		return "Estrategia2";
	}
}
