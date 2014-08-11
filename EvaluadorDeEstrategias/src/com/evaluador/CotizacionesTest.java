package com.evaluador;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

public class CotizacionesTest {
	
	@Test
	public void cotizacionDeUnaAccionEnUnaFecha() {
		assertEquals(290.0,	Cotizaciones.cotizacionDeAccionEnFecha("YPF", new DateTime("2014-4-1")),0);
	}

}
