package com.evaluador;

import org.joda.time.DateTime;

public class Estrategia1 extends Estrategia {

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
		Double cotizacionActual = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Double cotizacionDiaAnterior = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha.minusDays(1));
		double delta = cotizacionActual - cotizacionDiaAnterior;
		
		double porcentaje = (delta/cotizacionDiaAnterior)*100;
		return (Math.signum(porcentaje) > 0) && (Math.abs(porcentaje) >= 2.0);
	}

}
