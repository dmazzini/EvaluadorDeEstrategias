package com.evaluador;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;

public class Cotizaciones {

	static final Map<ClaveCompuesta,Double> cotizaciones = new HashMap<ClaveCompuesta, Double>() {{
		put(new ClaveCompuesta("YPF", new DateTime(2014, 4, 1, 0, 0)), 290.0);
		put(new ClaveCompuesta("TS", new DateTime(2014, 4, 1, 0, 0)), 215.5);
		put(new ClaveCompuesta("GGAL", new DateTime(2014, 4, 1, 0, 0)), 13.45);
		put(new ClaveCompuesta("YPF", new DateTime(2014, 4, 2, 0, 0)), 294.0);
		put(new ClaveCompuesta("TS", new DateTime(2014, 4, 2, 0, 0)), 216.5);
		put(new ClaveCompuesta("GGAL", new DateTime(2014, 4, 2, 0, 0)), 13.25);
		put(new ClaveCompuesta("YPF", new DateTime(2014, 4, 3, 0, 0)), 288.0);
		put(new ClaveCompuesta("TS", new DateTime(2014, 4, 3, 0, 0)), 216.0);
		put(new ClaveCompuesta("GGAL", new DateTime(2014, 4, 3, 0, 0)), 12.8);
		put(new ClaveCompuesta("YPF", new DateTime(2014, 4, 4, 0, 0)), 294.0);
		put(new ClaveCompuesta("TS", new DateTime(2014, 4, 4, 0, 0)), 213.0);
		put(new ClaveCompuesta("GGAL", new DateTime(2014, 4, 4, 0, 0)), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime(2014, 4, 5, 0, 0)), 292.0);
		put(new ClaveCompuesta("TS", new DateTime(2014, 4, 5, 0, 0)), 215.0);
		put(new ClaveCompuesta("GGAL", new DateTime(2014, 4, 5, 0, 0)), 14.0);
		put(new ClaveCompuesta("YPF", new DateTime(2014, 4, 6, 0, 0)), 290.0);
		put(new ClaveCompuesta("TS", new DateTime(2014, 4, 6, 0, 0)), 212.0);
		put(new ClaveCompuesta("GGAL", new DateTime(2014, 4, 6, 0, 0)), 13.5);
		put(new ClaveCompuesta("YPF", new DateTime(2014, 4, 7, 0, 0)), 293.0);
		put(new ClaveCompuesta("TS", new DateTime(2014, 4, 7, 0, 0)), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime(2014, 4, 7, 0, 0)), 13.0);
	}};

	public static Double cotizacionDeAccionEnFecha(String accion, DateTime fecha) {
		return cotizaciones.get(new ClaveCompuesta(accion,fecha));
	}
	
}
