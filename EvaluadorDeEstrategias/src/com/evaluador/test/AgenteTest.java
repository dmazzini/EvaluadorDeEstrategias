package com.evaluador.test;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import com.evaluador.Agente;
import com.evaluador.Cotizaciones;


public class AgenteTest {

	@Test
	public void realizarUnaCompra() {
		Agente agente = new Agente(1000000.0);
		String accion = "GGAL";
		int cantidad = 75;
		DateTime fecha = new DateTime("2014-4-2");
		Double cotizacion =  Cotizaciones.cotizacionDeAccionEnFecha(accion, fecha);

		agente.realizarCompra(accion, cantidad, cotizacion, fecha);
		
		assertEquals(Double.valueOf(999006.25), agente.cantidadDineroEfectivo(), 0.5);
		assertEquals(Integer.valueOf(cantidad), agente.cantidadDeAccionesDeUnaEmpresa("GGAL"));
	}
	
	@Test
	public void realizarVenta() {
		Agente agente = new Agente(1000000.0);
		String accion = "GGAL";
		int cantidad = 75;
		DateTime fechaCompra = new DateTime("2014-4-2");
		Double cotizacionCompra =  Cotizaciones.cotizacionDeAccionEnFecha(accion, fechaCompra);
		DateTime fechaVenta = new DateTime("2014-4-3");
		Double cotizacionVenta =  Cotizaciones.cotizacionDeAccionEnFecha(accion, fechaVenta);
		
		agente.realizarCompra(accion, cantidad, cotizacionCompra, fechaCompra);
		agente.realizarVenta(accion, cantidad, cotizacionVenta, fechaVenta);

		assertEquals(Double.valueOf(999966.25), agente.cantidadDineroEfectivo(), 0.5);
		assertEquals(Integer.valueOf(0), agente.cantidadDeAccionesDeUnaEmpresa("GGAL"));
	}
	
//	@Test
//	public void realizarVariasCompras() {
//		Agente agente = new Agente(1000000.0);
//		agente.realizarCompra("GGAL", new DateTime("2014-4-2"));
//		agente.realizarCompra("YPF", new DateTime("2014-4-3"));
//		agente.realizarCompra("GGAL", new DateTime("2014-4-3"));
//		assertEquals(Double.valueOf(997143.85), agente.cantidadDineroEfectivo(), 0.5);
//		assertEquals(Integer.valueOf(3), agente.cantidadDeAcciones("YPF"));
//		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("TS"));
//		assertEquals(Integer.valueOf(153), agente.cantidadDeAcciones("GGAL"));
//	}
	
}
