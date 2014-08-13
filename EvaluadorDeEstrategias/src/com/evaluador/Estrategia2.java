package com.evaluador;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Estrategia2 extends Estrategia {

	protected boolean cumpleCondicionCompra(String accion, Agente agente, DateTime fecha) {
		Double cotizacionActual = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Double cotizacionDiaAnterior = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha.minusDays(1));
		
		double porcentaje = OperacionesMatematicas.calcularPorcentaje(cotizacionActual,cotizacionDiaAnterior);
		
		boolean condicion1 = (Math.signum(porcentaje) < 0) && (Math.abs(porcentaje) >= 1.0);
		
		double promedioDeCotizaciones = Cotizaciones.promedioDeCotizacionesHastaLaFecha(accion, fecha);
		boolean condicion2 = cotizacionActual >= 2*promedioDeCotizaciones;
		
		return condicion1 || condicion2;
	}

	protected boolean cumpleCondicionVenta(String accion, Agente agente, DateTime fecha) {
		
		DateTime fechaCompra = agente.fechaDeAccionMasAntigua(accion);
		
		return fechaCompra != null && (Days.daysBetween(fechaCompra, fecha).getDays() >= 5);
	}

	@Override
	protected String nombreEstrategia() {
		return "Estrategia2";
	}

}
