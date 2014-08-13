package com.evaluador;

import org.joda.time.DateTime;

public class Compra extends Operacion {

	public Compra(String accion, DateTime fecha, Double cotizacion, Integer cantidad) {
		this.accion = accion;
		this.fecha = fecha;
		this.cotizacion = cotizacion;
		this.cantidad = cantidad;
	}

	@Override
	public void operar(Agente agente) {
		agente.realizarCompra(accion, cantidad, cotizacion, fecha);
	}

	public String tipoOperacion() {
		return "Compra";
	}
}
