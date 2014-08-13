package com.evaluador;

import org.joda.time.DateTime;

public class Cotizacion {

	private String accion;
	private DateTime fecha;
	private double precio;

	public Cotizacion(String accion, DateTime fecha, double precio) {
		this.accion = accion;
		this.fecha = fecha;
		this.precio = precio;
	}

	public String accion() {
		return accion;
	}

}
