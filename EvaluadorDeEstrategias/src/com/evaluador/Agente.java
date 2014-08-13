package com.evaluador;

import org.joda.time.DateTime;

public class Agente {

	private Double cantidadDineroEfectivo;
	private Acciones acciones;

	public Agente(Double cantidaDineroEfectivo) {
		cantidadDineroEfectivo = cantidaDineroEfectivo;
		acciones = new Acciones();
	}

	public void realizarCompra(String accion, Integer cantidad, Double cotizacion, DateTime fecha) {
		this.guardarAccionesCompradas(accion, cantidad, fecha);
		this.restarEfectivo(cotizacion * cantidad);
	}
	
	public void realizarVenta(String accion, Integer cantidad, Double cotizacion, DateTime fecha) {
		this.quitarAccionesVendidas(accion);
		this.sumarEfectivo(cantidad*cotizacion);
	}
	
	public Double cantidadDineroEfectivo() {
		return cantidadDineroEfectivo;
	}

	public void guardarAccionesCompradas(String accion, Integer cantidad, DateTime fecha) {
		acciones.guardarAccionesCompradas(accion, cantidad, fecha);
	}

	public void quitarAccionesVendidas(String accion) {
		acciones.quitarAccionesVendidas(accion);		
	}

	public void sumarEfectivo(double efectivo) {
		cantidadDineroEfectivo += efectivo;
	}

	public void restarEfectivo(double efectivo) {
		cantidadDineroEfectivo -= efectivo;
	}

	public Integer cantidadDeAccionesDeUnaEmpresa(String accion) {
		return acciones.cantidadDeAccionesDeUnaEmpresa(accion);
	}

	public DateTime fechaDeAccionMasAntigua(String accion) {
		return acciones.fechaDeAccionMasAntigua(accion);
	}

}
