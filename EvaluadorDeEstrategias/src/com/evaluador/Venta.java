package com.evaluador;

import org.joda.time.DateTime;


public class Venta extends Operacion {
	
	public Venta(String accion, DateTime fecha, Double cotizacion, Integer cantidad) {
		this.accion = accion;
		this.fecha = fecha;
		this.cotizacion = cotizacion;
		this.cantidad = cantidad;
	}

	@Override
	public void operar(Agente agente) {
		agente.sumarEfectivo(cantidad*cotizacion);
		agente.quitarAccionesVendidas(accion);

	}

	public String tipoOperacion() {
		return "Venta";
	}
}
