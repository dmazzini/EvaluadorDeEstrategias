package com.evaluador.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.evaluador.Estrategia;
import com.evaluador.Estrategia1;
import com.evaluador.Estrategia2;
import com.evaluador.EvaluadorDeEstrategias;

public class EvaluadorTest {

	@Test
	public void evaluadorDeEstrategias() {
		final Estrategia estrategia1 = new Estrategia1();
		final Estrategia estrategia2 = new Estrategia2();
		Set<Estrategia> estrategias = new HashSet<Estrategia>() {
			{
				add(estrategia1);
				add(estrategia2);
			}
		};		
		EvaluadorDeEstrategias evaluador = new EvaluadorDeEstrategias();
		
		int mes = 4;
		int anio = 2014;
		
		ResultadoEvaluacion resultadoEvaluacion = evaluador.evaluarEstrategias(1000000.0, estrategias, mes, anio);
		
		assertTrue(resultadoEvaluacion.esEstrategiaGanadora(estrategia1));
		assertFalse(resultadoEvaluacion.esEstrategiaGanadora(estrategia2));
		
	}

	@Test
	public void evaluadorDeEstrategiasConDosGanadoras() {
		final Estrategia estrategia1 = new Estrategia1();
		final Estrategia estrategia2 = new Estrategia2();
		final Estrategia estrategia3 = new Estrategia1();
		Set<Estrategia> estrategias = new HashSet<Estrategia>() {
			{
				add(estrategia1);
				add(estrategia2);
				add(estrategia3);
			}
		};		
		EvaluadorDeEstrategias evaluador = new EvaluadorDeEstrategias();
		
		int mes = 4;
		int anio = 2014;
		
		ResultadoEvaluacion resultadoEvaluacion = evaluador.evaluarEstrategias(1000000.0, estrategias, mes, anio);
		
		assertTrue(resultadoEvaluacion.esEstrategiaGanadora(estrategia1));
		assertFalse(resultadoEvaluacion.esEstrategiaGanadora(estrategia2));
		assertTrue(resultadoEvaluacion.esEstrategiaGanadora(estrategia3));
		
	}
	
}
