package com.evaluador;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;

public class Agente {


	private Double cantidadDineroEfectivo;
	private Map<String, Integer> accionesCompradas;

	public Agente(Double cantidaDineroEfectivo) {
		cantidadDineroEfectivo = cantidaDineroEfectivo;
		accionesCompradas = new HashMap<String, Integer>();
	}

	public void realizarCompra(String accion, DateTime fechaCompra) {
		Double cotizacion = Cotizaciones.cotizacionDeAccionEnFecha(accion, fechaCompra);
		Integer cantidadAccionesCompradas = (int) Math.floor(1000/cotizacion);
		Integer cantidadAcciones;
		if(accionesCompradas.containsKey(accion)) {
			cantidadAcciones = accionesCompradas.get(accion) + cantidadAccionesCompradas;
		} else {
			cantidadAcciones = cantidadAccionesCompradas;
		}
		accionesCompradas.put(accion, cantidadAcciones);
		
		cantidadDineroEfectivo -= cotizacion * cantidadAccionesCompradas;
	}

	public Double cantidadDineroEfectivo() {
		return cantidadDineroEfectivo;
	}

	public Integer cantidadDeAcciones(String accion) {
		Integer ret;
		if(accionesCompradas.containsKey(accion)) {
			ret = accionesCompradas.get(accion);
		} else {
			ret = 0;
		}
		
		return ret;
	}

	public void realizarVenta(String accion, DateTime fechaVenta) {
		cantidadDineroEfectivo += cantidadDeAcciones(accion)*Cotizaciones.cotizacionDeAccionEnFecha(accion, fechaVenta);
		accionesCompradas.put(accion, 0);
	}

}
