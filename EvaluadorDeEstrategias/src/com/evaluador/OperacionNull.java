package com.evaluador;

import org.joda.time.DateTime;

public class OperacionNull extends Operacion {

	public OperacionNull(String accion, DateTime fecha) {
		this.accion = accion;
		this.fecha = fecha;
		this.cotizacion = 0.0;
		this.cantidad = 0;
	}

	@Override
	public void operar(Agente agente) {

	}

	@Override
	public String tipoOperacion() {
		return "Sin operar";
	}

}
