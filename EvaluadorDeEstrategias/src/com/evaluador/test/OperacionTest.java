package com.evaluador.test;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import com.evaluador.Agente;
import com.evaluador.Compra;
import com.evaluador.Cotizaciones;
import com.evaluador.Operacion;
import com.evaluador.Venta;

public class OperacionTest {
	
	@Test
	public void operacionCompra() {
		Agente agente = new Agente(1000000.0);
		String accion = "GGAL";
		DateTime fecha = new DateTime("2014-4-2");
		Double cotizacion = Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);
		Integer cantidad = 75;
		Operacion compra = new Compra(accion, fecha, cotizacion, cantidad);
		
		compra.operar(agente);
		
		assertEquals(Double.valueOf(999006.25), agente.cantidadDineroEfectivo(), 0.5);
		assertEquals(Integer.valueOf(cantidad), agente.cantidadDeAcciones("GGAL"));
	}
	
	@Test
	public void operacionVenta() {
		Agente agente = new Agente(1000000.0);
		String accion = "GGAL";
		DateTime fechaCompra = new DateTime("2014-4-2");
		Double cotizacionCompra = Cotizaciones.cotizacionDeAccionEnFecha(accion, fechaCompra);
		DateTime fechaVenta = new DateTime("2014-4-3");
		Double cotizacionVenta = Cotizaciones.cotizacionDeAccionEnFecha(accion, fechaVenta);
		Integer cantidad = 75;
		Operacion compra = new Compra(accion, fechaCompra, cotizacionCompra, cantidad);
		Operacion venta = new Venta(accion, fechaVenta, cotizacionVenta, cantidad);
		
		compra.operar(agente);
		venta.operar(agente);
		
		assertEquals(Double.valueOf(999966.25), agente.cantidadDineroEfectivo(), 0.5);
		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("GGAL"));
	}
}
