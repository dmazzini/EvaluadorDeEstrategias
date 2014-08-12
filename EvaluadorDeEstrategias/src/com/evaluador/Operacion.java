package com.evaluador;

import org.joda.time.DateTime;

public abstract class Operacion {

	protected String accion;
	protected DateTime fecha;
	protected Double cotizacion;
	protected Integer cantidad;

	public abstract void operar(Agente agente);

	public abstract String tipoOperacion();
}
