package com.evaluador.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.junit.Test;

import com.evaluador.Estrategia;
import com.evaluador.Estrategia1;
import com.evaluador.Estrategia2;
import com.evaluador.EvaluadorDeEstrategias;
import com.evaluador.RegistroOperaciones;

public class RegistroDeOperacionesTest {

	@Test
	public void test4() {

		final Estrategia1 estrategia1 = new Estrategia1();
		final Estrategia2 estrategia2 = new Estrategia2();
		Set<Estrategia> estrategias = new HashSet<Estrategia>() {
			{
				add(estrategia1);
				add(estrategia2);
			}
		};

		EvaluadorDeEstrategias evaluador = new EvaluadorDeEstrategias();
		RegistroOperaciones registroOperaciones = new RegistroOperaciones();
		evaluador.evaluarEstrategias(1000000.0, estrategias, new DateTime("2014-4-1"));
		assertEquals(11, registroOperaciones.cantidadDeOperacionesDeUnaEstrategia(estrategia1));
		assertEquals(9,	registroOperaciones.cantidadDeOperacionesDeUnaEstrategia(estrategia1));
	}

}
