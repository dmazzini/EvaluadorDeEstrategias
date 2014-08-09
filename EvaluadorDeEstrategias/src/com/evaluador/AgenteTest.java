package com.evaluador;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.junit.Test;


public class AgenteTest {


	@Test
	public void test() {
		Agente agente = new Agente(1000000.0);
		agente.realizarCompra("GGAL", new DateTime(2014, 4, 2, 0, 0));
		assertEquals(Double.valueOf(999006.25), agente.cantidadDineroEfectivo(), 0.5);
		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("YPF"));
		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("TS"));
		assertEquals(Integer.valueOf(75), agente.cantidadDeAcciones("GGAL"));
	}
	
	@Test
	public void test2() {
		Agente agente = new Agente(1000000.0);
		agente.realizarCompra("GGAL", new DateTime(2014, 4, 2, 0, 0));
		agente.realizarCompra("YPF", new DateTime(2014, 4, 3, 0, 0));
		agente.realizarCompra("GGAL", new DateTime(2014, 4, 3, 0, 0));
		assertEquals(Double.valueOf(997143.85), agente.cantidadDineroEfectivo(), 0.5);
		assertEquals(Integer.valueOf(3), agente.cantidadDeAcciones("YPF"));
		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("TS"));
		assertEquals(Integer.valueOf(153), agente.cantidadDeAcciones("GGAL"));
	}
	
	@Test
	public void test3() {
		Agente agente = new Agente(1000000.0);
		agente.realizarCompra("GGAL", new DateTime(2014, 4, 2, 0, 0));
		agente.realizarCompra("YPF", new DateTime(2014, 4, 3, 0, 0));
		agente.realizarCompra("GGAL", new DateTime(2014, 4, 3, 0, 0));
		agente.realizarVenta("YPF", new DateTime(2014, 4, 4, 0, 0) );
		agente.realizarCompra("TS", new DateTime(2014, 4, 4, 0, 0));
		assertEquals(Double.valueOf(997173.85), agente.cantidadDineroEfectivo(), 0.5);
		assertEquals(Integer.valueOf(0), agente.cantidadDeAcciones("YPF"));
		assertEquals(Integer.valueOf(4), agente.cantidadDeAcciones("TS"));
		assertEquals(Integer.valueOf(153), agente.cantidadDeAcciones("GGAL"));
	}

	@Test
	public void test4() {
		Estrategia estrategia1 = new Estrategia1();
		assertFalse(estrategia1.decidirCompra("YPF", new DateTime(2014, 4, 2, 0, 0)));
		assertFalse(estrategia1.decidirCompra("TS", new DateTime(2014, 4, 2, 0, 0)));
		assertTrue(estrategia1.decidirCompra("GGAL", new DateTime(2014, 4, 2, 0, 0)));
	}

	@Test
	public void test5() {
		Estrategia estrategia1 = new Estrategia1();
		assertTrue(estrategia1.decidirVenta("YPF", new DateTime(2014, 4, 4, 0, 0)));
		assertFalse(estrategia1.decidirVenta("TS", new DateTime(2014, 4, 4, 0, 0)));
		assertFalse(estrategia1.decidirVenta("GGAL", new DateTime(2014, 4, 4, 0, 0)));
	}
	
	@Test
	public void test6() {
		Map<String,DateTime> fechasDeCompra = new HashMap<String, DateTime>();
		Estrategia estrategia2 = new Estrategia2(fechasDeCompra);
		assertFalse(estrategia2.decidirVenta("YPF", new DateTime(2014, 4, 2, 0, 0)));
		assertFalse(estrategia2.decidirVenta("TS", new DateTime(2014, 4, 2, 0, 0)));
		assertFalse(estrategia2.decidirVenta("GGAL", new DateTime(2014, 4, 2, 0, 0)));
	}

	@Test
	public void test7() {
		Map<String,DateTime> fechasDeCompra = null;
		Estrategia estrategia2 = new Estrategia2(fechasDeCompra);
		assertFalse(estrategia2.decidirVenta("YPF", new DateTime(2014, 4, 7, 0, 0)));
		assertFalse(estrategia2.decidirVenta("TS", new DateTime(2014, 4, 7, 0, 0)));
		assertTrue(estrategia2.decidirVenta("GGAL", new DateTime(2014, 4, 7, 0, 0)));
	}
	
//	@Test
//	public void test() {
//		
//		Set<String> acciones = new HashSet<String>(){{  
//			  add("YPF"); 
//			  add("TS"); 
//			  add("GGAL");  
//		}};
//		
//		final Estrategia estrategia1 = new Estrategia1();
//		final Estrategia estrategia2 = new Estrategia2();
//		Set<Estrategia> estrategias = new HashSet<Estrategia>(){{  
//			  add(estrategia1); 
//			  add(estrategia2);  
//		}};
//		assertTrue(evaluarEstrategias(acciones, DateTimeConstants.APRIL, 2014, estrategias).contains(estrategia2));
//	}

	private Set<Estrategia> evaluarEstrategias(Set<String> acciones, int mes, int anio, Set<Estrategia> estrategias) {
		Set<Estrategia> ret = new HashSet<Estrategia>();
		
		
		return ret;
	}
}
