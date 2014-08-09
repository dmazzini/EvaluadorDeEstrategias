package com.evaluador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTimeConstants;
import org.junit.Test;

public class TestXXX {

	@Test
	public void test1(){
		
		final Estrategia1 estrategia1 = new Estrategia1();
		final Estrategia2 estrategia2 = new Estrategia2(null);
		Set<Estrategia> estrategias = new HashSet<Estrategia>() {{
			add(estrategia1); 
			add(estrategia2);
		}};
		RegistroOperaciones registroOperaciones = new RegistroOperaciones();
		assertTrue(evaluarEstrategias(estrategias, DateTimeConstants.APRIL, registroOperaciones).contains(estrategia2));
		assertFalse(evaluarEstrategias(estrategias, DateTimeConstants.APRIL, registroOperaciones).contains(estrategia1));
	}

	@Test
	public void test2(){
		
		final Estrategia1 estrategia1 = new Estrategia1();
		final Estrategia2 estrategia2 = new Estrategia2(null);
		Set<Estrategia> estrategias = new HashSet<Estrategia>() {{
			add(estrategia1); 
			add(estrategia2);
		}};
		
		RegistroOperaciones registroOperaciones = new RegistroOperaciones();
		evaluarEstrategias(estrategias, DateTimeConstants.APRIL, registroOperaciones);
		assertEquals(11, registroOperaciones.cantidadDeOperacionesDeUnaEstrategia(estrategia1));
		assertEquals(9, registroOperaciones.cantidadDeOperacionesDeUnaEstrategia(estrategia1));
	}
	
	
	
	private Set<Estrategia> evaluarEstrategias(Set<Estrategia> estrategias, int mes, RegistroOperaciones registroOperaciones) {
		Set ret = new HashSet();
		int resultadoEstrategia;
		for (Estrategia estrategia : estrategias) {
			resultadoEstrategia = ejecutarOperaciones(estrategia);
		}
		
		return ret;
	}

	private int ejecutarOperaciones(Estrategia estrategia) {
		// TODO Auto-generated method stub
		return 0;
	}
}
