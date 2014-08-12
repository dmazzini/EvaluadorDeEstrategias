package com.evaluador;

import org.joda.time.DateTime;

public abstract class Estrategia {

	public abstract Operacion crearOperacion(String accion, Agente agente, DateTime fecha);

	public Operacion crearVentaUltimoDia(String accion, Agente agente, DateTime fecha) {
		Operacion operacion = new OperacionNull();
		Integer cantidad = agente.cantidadDeAccionesDeUnaEmpresa(accion);
		Double cotizacion = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		if (cantidad > 0) {
			operacion = new Venta(accion, fecha, cotizacion, cantidad);
		}
		return operacion;
	}
	

}
