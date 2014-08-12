package com.evaluador;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Estrategia2 extends Estrategia {

	@Override
	public Operacion crearOperacion(String accion, Agente agente, DateTime fecha) {
		Operacion operacion = new OperacionNull();
		Double cotizacion = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Integer cantidad;
		if (decidirCompra(accion, fecha)) {
			cantidad = (int) Math.floor(1000/cotizacion);
			operacion = new Compra(accion, fecha, cotizacion, cantidad);
		} else if (decidirVenta(accion, agente.acciones(), fecha)) {
			cantidad = agente.cantidadDeAccionesDeUnaEmpresa(accion);
			operacion = new Venta(accion, fecha, cotizacion, cantidad);
		}
		return operacion;
	}
	
	private boolean decidirCompra(String accion, DateTime fecha) {
		Double cotizacionActual = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Double cotizacionDiaAnterior = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha.minusDays(1));
		double delta = cotizacionActual - cotizacionDiaAnterior;
		
		double porcentaje = (delta/cotizacionDiaAnterior)*100;
		boolean condicion1 = (Math.signum(porcentaje) < 0) && (Math.abs(porcentaje) >= 1.0);
		
		double promedioDeCotizaciones = Cotizaciones.promedioDeCotizacionesHastaLaFecha(accion, fecha);
		boolean condicion2 = cotizacionActual >= 2*promedioDeCotizaciones;
		
		return condicion1 || condicion2;
	}

	private boolean decidirVenta(String accion, Acciones acciones, DateTime fecha) {
		
		DateTime fechaCompra = acciones.fechaDeAccionMasAntigua(accion);
		
		return fechaCompra != null && (Days.daysBetween(fechaCompra, fecha).getDays() >= 5);
	}

	@Override
	public String toString() {
		return "Estrategia2";
	}

}
