package com.evaluador;

import org.joda.time.DateTime;

public abstract class Estrategia {

	public Operacion crearOperacion(String accion, Agente agente, DateTime fecha) {
		Operacion operacion = new OperacionNull(accion, fecha);
		Double cotizacion = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Integer cantidad;
		if (cumpleCondicionCompra(accion, agente, fecha)) {
			cantidad = (int) Math.floor(1000/cotizacion);
			operacion = new Compra(accion, fecha, cotizacion, cantidad);
		} 
		if (cumpleCondicionVenta(accion, agente, fecha) || esUltimoDiaDelMes(fecha)) {
			cantidad = agente.cantidadDeAccionesDeUnaEmpresa(accion);
			operacion = new Venta(accion, fecha, cotizacion, cantidad);
		}
		return operacion;
	}
	
	protected abstract boolean cumpleCondicionCompra(String accion, Agente agente, DateTime fecha);

	protected abstract boolean cumpleCondicionVenta(String accion, Agente agente,	DateTime fecha);
	
	protected abstract String nombreEstrategia();

	private boolean esUltimoDiaDelMes(DateTime fecha) {
		return fecha.getDayOfMonth() == fecha.dayOfMonth().getMaximumValue();
	}
}
