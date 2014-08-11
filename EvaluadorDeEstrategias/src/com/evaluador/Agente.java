package com.evaluador;

import org.joda.time.DateTime;

public class Agente {

	private Double cantidadDineroEfectivo;
	private Acciones acciones;

	public Agente(Double cantidaDineroEfectivo) {
		cantidadDineroEfectivo = cantidaDineroEfectivo;
		acciones = new Acciones();
	}

	public void realizarCompra(String accion, DateTime fecha) {
		Double cotizacion = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Integer cantidadAccionesCompradas = (int) Math.floor(1000/cotizacion);

		acciones.guardarAccionesCompradas(accion, cantidadAccionesCompradas, fecha);
		cantidadDineroEfectivo -= cotizacion * cantidadAccionesCompradas;
		
		System.out.println("Compro accion:" + accion + " cantidad:" + cantidadAccionesCompradas + " fecha:" + fecha);
	}

	public void realizarVenta(String accion, DateTime fecha) {
		Integer cantidadDeAccionesDeUnaEmpresa = acciones.cantidadDeAccionesDeUnaEmpresa(accion);
		cantidadDineroEfectivo += cantidadDeAccionesDeUnaEmpresa*Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		acciones.quitarAccionesVendidas(accion);
		
		System.out.println("Vendio accion:" + accion + " cantidad:" + cantidadDeAccionesDeUnaEmpresa + " fecha:" + fecha);
		
	}
	
	public Double cantidadDineroEfectivo() {
		return cantidadDineroEfectivo;
	}

	public Integer cantidadDeAcciones(String accion) {
		return acciones.cantidadDeAccionesDeUnaEmpresa(accion);
	}

	public Acciones acciones() {
		return acciones;
	}

	
}
