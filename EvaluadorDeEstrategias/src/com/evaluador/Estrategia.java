package com.evaluador;

import org.joda.time.DateTime;

public abstract class Estrategia {

	public abstract boolean decidirCompra(String accion, DateTime fecha);

	public abstract boolean decidirVenta(String accion, DateTime fecha); 
	

}
