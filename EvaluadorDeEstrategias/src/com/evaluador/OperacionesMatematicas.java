package com.evaluador;

public class OperacionesMatematicas {
	public static double calcularPorcentaje(Double cotizacionActual, Double cotizacionDiaAnterior) {
		double delta = cotizacionActual - cotizacionDiaAnterior;		
		double porcentaje = (delta/cotizacionDiaAnterior)*100;
		return porcentaje;
	}
}
