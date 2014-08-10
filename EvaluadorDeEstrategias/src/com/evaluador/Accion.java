package com.evaluador;

import org.joda.time.DateTime;

public class Accion {

	private String nombre;
	private Integer cantidad;
	private DateTime fecha;

	public Accion(String nombre, Integer cantidad,	DateTime fecha) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public DateTime getFecha() {
		return fecha;
	}

}
