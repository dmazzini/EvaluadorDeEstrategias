package com.evaluador;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;

public class EvaluadorDeEstrategias {

	public Set<Estrategia> evaluarEstrategias(Double cantidadDineroEfectivo, Set<Estrategia> estrategias, DateTime fechaInicial) {
		Set<Estrategia> estrategiasGanadoras = new HashSet<Estrategia>();
		Double mejorResultado =  null;
		for (Estrategia estrategia : estrategias) {
			System.out.println("Estrategia:" + estrategia);
			Double resultado = ejecutarOperaciones(new Agente(cantidadDineroEfectivo), estrategia, fechaInicial);
			if (mejorResultado == null || mejorResultado <= resultado) {
				mejorResultado = resultado;
				estrategiasGanadoras.clear();
				estrategiasGanadoras.add(estrategia);
			} 
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
			for (String accion : Cotizaciones.acciones()) {
				if (estrategia.decidirCompra(accion, iteradorIntervalo)) {
					agente.realizarCompra(accion, iteradorIntervalo);
				}
				
				if (estrategia.decidirVenta(accion, agente.acciones(), iteradorIntervalo)) {
					agente.realizarVenta(accion, iteradorIntervalo);
				}
			}
			System.out.println("Fecha:"+iteradorIntervalo + " efectivo:" + agente.cantidadDineroEfectivo());
			iteradorIntervalo = iteradorIntervalo.plusDays(1);
		}
		
		//El ultimo dia se venden todas las acciones
		for (String accion : Cotizaciones.acciones()) {
			agente.realizarVenta(accion, iteradorIntervalo);
		}
		
		return agente.cantidadDineroEfectivo();
	}
}
