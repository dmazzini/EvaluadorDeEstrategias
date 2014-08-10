package com.evaluador;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Test;

public class EstrategiaTest {

	@Test
	public void test4() {
		Estrategia estrategia1 = new Estrategia1();
		assertFalse(estrategia1.decidirCompra("YPF", new DateTime("2014-4-2")));
		assertFalse(estrategia1.decidirCompra("TS", new DateTime("2014-4-2")));
		assertTrue(estrategia1.decidirCompra("GGAL", new DateTime("2014-4-2")));
	}

	@Test
	public void test5() {
		Estrategia estrategia1 = new Estrategia1();
		assertTrue(estrategia1.decidirVenta("YPF", new DateTime("2014-4-4")));
		assertFalse(estrategia1.decidirVenta("TS", new DateTime("2014-4-4")));
		assertFalse(estrategia1.decidirVenta("GGAL", new DateTime("2014-4-4")));
	}
	
	@Test
	public void test6() {
		Agente agente = new Agente(1000000.0);
		Estrategia estrategia2 = new Estrategia2(agente.acciones());
		assertFalse(estrategia2.decidirVenta("YPF", new DateTime("2014-4-2")));
		assertFalse(estrategia2.decidirVenta("TS", new DateTime("2014-4-2")));
		assertFalse(estrategia2.decidirVenta("GGAL", new DateTime("2014-4-2")));
	}

	@Test
	public void test7() {
		Agente agente = new Agente(1000000.0);
		agente.realizarCompra("GGAL", new DateTime("2014-4-2"));
		Estrategia estrategia2 = new Estrategia2(agente.acciones());
		assertFalse(estrategia2.decidirVenta("YPF", new DateTime("2014-4-7")));
		assertFalse(estrategia2.decidirVenta("TS", new DateTime("2014-4-7")));
		assertTrue(estrategia2.decidirVenta("GGAL", new DateTime("2014-4-7")));
	}
}
