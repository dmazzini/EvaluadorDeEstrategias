package com.evaluador.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.junit.Test;

import com.evaluador.Estrategia;
import com.evaluador.Estrategia1;
import com.evaluador.Estrategia2;
import com.evaluador.EvaluadorDeEstrategias;

public class EvaluadorTest {

	@Test
	public void evaluadorDeEstrategias() {
		final Estrategia estrategia1 = new Estrategia1();
		final Estrategia2 estrategia2 = new Estrategia2();
		Set<Estrategia> estrategias = new HashSet<Estrategia>() {
			{
				add(estrategia1);
				add(estrategia2);
			}
		};
		EvaluadorDeEstrategias evaluador = new EvaluadorDeEstrategias();
		assertTrue(evaluador.evaluarEstrategias(1000000.0 , estrategias,  new DateTime("2014-4-1")).contains(estrategia1));
		assertFalse(evaluador.evaluarEstrategias(1000000.0, estrategias, new DateTime("2014-4-1")).contains(estrategia2));
	}
	

	
}
