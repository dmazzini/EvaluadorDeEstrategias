package com.evaluador;

import org.joda.time.DateTime;

public class Registro {

	private final String accion;
	private final Integer cantidad;
	private final Double cotizacion;
	private final DateTime fecha;
	private final String estrategia;
	private final String tipoOperacion;

	public Registro(String tipoOperacion, String accion, Integer cantidad, Double cotizacion,	DateTime fecha, String estrategia) {
				this.tipoOperacion = tipoOperacion;
				this.accion = accion;
				this.cantidad = cantidad;
				this.cotizacion = cotizacion;
				this.fecha = fecha;
				this.estrategia = estrategia;
	}

	public String estrategia() {
		return estrategia;
	}

	public String tipoOperacion() {
		return tipoOperacion;
	}

	@Override
	public String toString() {
		return "Registro [accion=" + accion + ", cantidad=" + cantidad
				+ ", cotizacion=" + cotizacion + ", fecha=" + fecha
				+ ", estrategia=" + estrategia + ", tipoOperacion="
				+ tipoOperacion + "]";
	}

	
}
