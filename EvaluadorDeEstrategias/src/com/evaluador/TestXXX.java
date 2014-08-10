package com.evaluador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.junit.Test;

public class TestXXX {

	static final Set<String> acciones = new HashSet<String>() {{
		add("YPF");
		add("TS");
		add("GGAL");
	}};
	
	@Test
	public void test1() {
		assertEquals(290.0,	Cotizaciones.cotizacionDeAccionEnFecha("YPF", new DateTime("2014-4-1")),0);
	}

	@Test
	public void test2() {
		assertEquals(215.5, Cotizaciones.cotizacionDeAccionEnFecha("TS", new DateTime("2014-4-1")),	0);
	}
	
	@Test
	public void test3() {

		final Estrategia1 estrategia1 = new Estrategia1();
		final Estrategia2 estrategia2 = new Estrategia2(null);
		Set<Estrategia> estrategias = new HashSet<Estrategia>() {
			{
				add(estrategia1);
				add(estrategia2);
			}
		};
		Agente agente = new Agente(1000000.0);
		assertTrue(evaluarEstrategias(agente , estrategias,  new DateTime("2014-4-1")).contains(estrategia2));
		assertFalse(evaluarEstrategias(agente, estrategias, new DateTime("2014-4-1")).contains(estrategia1));
	}
	
	@Test
	public void test4() {

		final Estrategia1 estrategia1 = new Estrategia1();
		final Estrategia2 estrategia2 = new Estrategia2(null);
		Set<Estrategia> estrategias = new HashSet<Estrategia>() {
			{
				add(estrategia1);
				add(estrategia2);
			}
		};

		RegistroOperaciones registroOperaciones = new RegistroOperaciones();
		Agente agente = new Agente(1000000.0);
		evaluarEstrategias(agente, estrategias, new DateTime("2014-4-1"));
		assertEquals(11, registroOperaciones.cantidadDeOperacionesDeUnaEstrategia(estrategia1));
		assertEquals(9,	registroOperaciones.cantidadDeOperacionesDeUnaEstrategia(estrategia1));
	}

	private Set<Estrategia> evaluarEstrategias(Agente agente, Set<Estrategia> estrategias, DateTime fechaInicial) {
		Set estrategiasGanadoras = new HashSet();
		double resultadoEstrategia;
		for (Estrategia estrategia : estrategias) {
			resultadoEstrategia = ejecutarOperaciones(agente, estrategia, fechaInicial);
		}
		return estrategiasGanadoras;
	}

	private double ejecutarOperaciones(Agente agente, Estrategia estrategia, DateTime fecha) {
		DateTime primerDia = fecha;
		int ultimoDiaDelMes = fecha.dayOfMonth().getMaximumValue();
		//El primer dia no se realizan operaciones
		DateTime comienzoIntervalo = primerDia.plusDays(1);
		DateTime finIntervalo = fecha.plusDays(ultimoDiaDelMes-1);
		DateTime iteradorIntervalo = comienzoIntervalo;
		while (iteradorIntervalo.compareTo(finIntervalo) < 0) {
			for (String accion : acciones) {
				if (estrategia.decidirCompra(accion, iteradorIntervalo)) {
					agente.realizarCompra(accion, iteradorIntervalo);
				}
				
				if (estrategia.decidirVenta(accion, iteradorIntervalo)) {
					agente.realizarVenta(accion, iteradorIntervalo);
				}
			}
			iteradorIntervalo = iteradorIntervalo.plusDays(1);
		}
		
		//El ultimo dia se venden todas las acciones
		for (String accion : acciones) {
			agente.realizarVenta(accion, iteradorIntervalo);
		}
		
		return agente.cantidadDineroEfectivo();
	}
	
}
