package com.evaluador.test;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import com.evaluador.Agente;


public class AgenteTest {

//	@Test
//	public void realizarUnaCompra() {
//		Agente agente = new Agente(1000000.0);
//		agente.realizarCompra("GGAL", new DateTime("2014-4-2"));
//		assertEquals(Double.valueOf(999006.25), agente.cantidadDineroEfectivo(), 0.5);
//		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("YPF"));
//		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("TS"));
//		assertEquals(Integer.valueOf(75), agente.cantidadDeAcciones("GGAL"));
//	}
//	
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
//	
//	@Test
//	public void realizarVenta() {
//		Agente agente = new Agente(1000000.0);
//		agente.realizarCompra("GGAL", new DateTime("2014-4-2"));
//		agente.realizarCompra("YPF", new DateTime("2014-4-3"));
//		agente.realizarCompra("GGAL", new DateTime("2014-4-3"));
//		agente.realizarVenta("YPF", new DateTime("2014-4-4") );
//		agente.realizarCompra("TS", new DateTime("2014-4-4"));
//		assertEquals(Double.valueOf(997173.85), agente.cantidadDineroEfectivo(), 0.5);
//		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("YPF"));
//		assertEquals(Integer.valueOf(4), agente.cantidadDeAcciones("TS"));
//		assertEquals(Integer.valueOf(153), agente.cantidadDeAcciones("GGAL"));
//	}

}
