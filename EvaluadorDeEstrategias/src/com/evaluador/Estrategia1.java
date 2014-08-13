package com.evaluador;

import org.joda.time.DateTime;

public class Estrategia1 extends Estrategia {

	@Override
	protected boolean cumpleCondicionCompra(String accion, Agente agente, DateTime fecha) {
		Double cotizacionActual = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Double cotizacionDiaAnterior = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha.minusDays(1));
		
		double porcentaje = OperacionesMatematicas.calcularPorcentaje(cotizacionActual,cotizacionDiaAnterior);
		
		return (Math.signum(porcentaje) < 0) && (Math.abs(porcentaje) >= 1.0);
	}

	@Override
	protected boolean cumpleCondicionVenta(String accion, Agente agente, DateTime fecha) {
		Double cotizacionActual = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Double cotizacionDiaAnterior = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha.minusDays(1));
		
		double porcentaje = OperacionesMatematicas.calcularPorcentaje(cotizacionActual, cotizacionDiaAnterior);
		
		return (Math.signum(porcentaje) > 0) && (Math.abs(porcentaje) >= 2.0);
	}
	
	@Override
	protected String nombreEstrategia() {
		return "Estrategia1";
	}
	
}
