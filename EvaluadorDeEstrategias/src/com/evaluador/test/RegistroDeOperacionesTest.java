package com.evaluador.test;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import com.evaluador.Agente;
import com.evaluador.Estrategia;
import com.evaluador.Estrategia1;
import com.evaluador.Operacion;
import com.evaluador.RegistroOperaciones;

public class RegistroDeOperacionesTest {

	@Test
	public void registroDeOperacion() {

		Estrategia estrategia = new Estrategia1();
		Agente agente = new Agente(1000000.0);		
		Operacion operacion = estrategia.crearOperacion("GGAL", agente , new DateTime("2014-4-2"));
		RegistroOperaciones registroOperaciones = new RegistroOperaciones();
		
		registroOperaciones.registrarOperacion(operacion, estrategia);
		
		assertEquals(1, registroOperaciones.cantidadDeOperacionesDeUnaEstrategia(estrategia));
		assertEquals(1, registroOperaciones.cantidadDeComprasDeUnaEstrategia(estrategia));
		assertEquals(0, registroOperaciones.cantidadDeVentasDeUnaEstrategia(estrategia));
		assertEquals(1, registroOperaciones.cantidadDeCompras());
		assertEquals(0, registroOperaciones.cantidadDeVentas());
	}

}
