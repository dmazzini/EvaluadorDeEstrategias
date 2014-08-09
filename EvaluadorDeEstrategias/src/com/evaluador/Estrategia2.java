package com.evaluador;

import java.util.Map;

import org.joda.time.DateTime;

public class Estrategia2 extends Estrategia {

	private Map<String, DateTime> fechasDeCompra;

	public Estrategia2(Map<String, DateTime> fechasDeCompra) {
		fechasDeCompra = fechasDeCompra;
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

		DateTime fechaCompra = fechasDeCompra.get(accion);
		
		return fechaCompra.compareTo(fecha) > 5;
	}

}
