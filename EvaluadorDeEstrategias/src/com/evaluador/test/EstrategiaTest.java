package com.evaluador.test;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import com.evaluador.Agente;
import com.evaluador.Estrategia;
import com.evaluador.Estrategia1;
import com.evaluador.Estrategia2;
import com.evaluador.Operacion;

public class EstrategiaTest {

	@Test
	public void crearCompraEstrategia1() {
		Estrategia estrategia = new Estrategia1();
		Agente agente = new Agente(1000000.0);
		
		Operacion operacion = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-2"));
		assertEquals("Compra", operacion.tipoOperacion());
	}
	
	@Test
	public void crearVentaEstrategia1() {
		Estrategia estrategia = new Estrategia1();
		Agente agente = new Agente(1000000.0);
		
		Operacion operacion1 = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-2"));
		operacion1.operar(agente);
		Operacion operacion2 = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-3"));
		operacion2.operar(agente);
		Operacion operacion3 = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-4"));
		operacion3.operar(agente);
		Operacion operacion = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-5"));
		
		assertEquals("Venta", operacion.tipoOperacion());
	}
	
	@Test
	public void crearCompraEstrategia2() {
		Estrategia estrategia = new Estrategia2();
		Agente agente = new Agente(1000000.0);
		
		Operacion operacion = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-2"));
		assertEquals("Compra", operacion.tipoOperacion());
	}
	
	@Test
	public void crearVentaEstrategia2() {
		Estrategia estrategia = new Estrategia2();
		Agente agente = new Agente(1000000.0);
		
		Operacion operacion1 = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-2"));
		operacion1.operar(agente);
		Operacion operacion2 = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-3"));
		operacion2.operar(agente);
		Operacion operacion3 = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-4"));
		operacion3.operar(agente);
		Operacion operacion4 = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-5"));
		operacion4.operar(agente);
		Operacion operacion5 = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-6"));
		operacion5.operar(agente);
		Operacion operacion = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-7"));
		operacion.operar(agente);
		
		assertEquals("Venta", operacion.tipoOperacion());
	}
}
