package com.evaluador.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Test;

import com.evaluador.Acciones;
import com.evaluador.Agente;
import com.evaluador.Estrategia;
import com.evaluador.Estrategia1;
import com.evaluador.Estrategia2;
import com.evaluador.Operacion;

public class EstrategiaTest {

//	@Test
//	public void decidirSiCompraConEstrategia1() {
//		Estrategia estrategia1 = new Estrategia1();
//		assertFalse(estrategia1.decidirCompra("YPF", new DateTime("2014-4-2")));
//		assertFalse(estrategia1.decidirCompra("TS", new DateTime("2014-4-2")));
//		assertTrue(estrategia1.decidirCompra("GGAL", new DateTime("2014-4-2")));
//	}
//
//	@Test
//	public void decidirSiVendeEstrategia1() {
//		Estrategia estrategia1 = new Estrategia1();
//		assertTrue(estrategia1.decidirVenta("YPF", new Acciones(), new DateTime("2014-4-4")));
//		assertFalse(estrategia1.decidirVenta("TS", new Acciones(), new DateTime("2014-4-4")));
//		assertFalse(estrategia1.decidirVenta("GGAL", new Acciones(), new DateTime("2014-4-4")));
//	}
//	
//	@Test
//	public void decidirSiVendeSinUnaCompraAnteriorConEstrategia2() {
//		Estrategia estrategia2 = new Estrategia2();
//		assertFalse(estrategia2.decidirVenta("YPF", new Acciones(),  new DateTime("2014-4-2")));
//		assertFalse(estrategia2.decidirVenta("TS", new Acciones(), new DateTime("2014-4-2")));
//		assertFalse(estrategia2.decidirVenta("GGAL", new Acciones(), new DateTime("2014-4-2")));
//	}
//
//	@Test
//	public void decidirSiVendeConUnaCompraAnteriorConEstrategia2() {
//		Acciones acciones = new Acciones();
//		acciones.guardarAccionesCompradas("GGAL", 10, new DateTime("2014-4-2"));
//		Estrategia estrategia2 = new Estrategia2();
//		assertFalse(estrategia2.decidirVenta("YPF", acciones, new DateTime("2014-4-7")));
//		assertFalse(estrategia2.decidirVenta("TS", acciones, new DateTime("2014-4-7")));
//		assertTrue(estrategia2.decidirVenta("GGAL", acciones, new DateTime("2014-4-7")));
//	}
	@Test
	public void test() {
		Estrategia estrategia = new Estrategia1();
		Agente agente = new Agente(1000000.0);
		
		Operacion operacion = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-2"));
		assertEquals("Compra", operacion.tipoOperacion());
		
	}
}
