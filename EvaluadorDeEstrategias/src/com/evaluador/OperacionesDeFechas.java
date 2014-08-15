package com.evaluador;

import org.joda.time.DateTime;

public class OperacionesDeFechas {

	public static boolean esPrimerDiaDelMes(DateTime fecha) {
		return fecha.getDayOfMonth() == fecha.dayOfMonth().getMinimumValue();
	}
	
	public static boolean esUltimoDiaDelMes(DateTime fecha) {
		return fecha.getDayOfMonth() == fecha.dayOfMonth().getMaximumValue();
	}
}
