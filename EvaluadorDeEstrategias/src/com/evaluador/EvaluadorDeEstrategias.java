package com.evaluador;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;

public class EvaluadorDeEstrategias {

	public Set<Estrategia> evaluarEstrategias(Double cantidadDineroEfectivo, Set<Estrategia> estrategias, DateTime fechaInicial) {
		RegistroOperaciones registroOperaciones = new RegistroOperaciones();
		Set<Estrategia> estrategiasGanadoras = new HashSet<Estrategia>();
		Double mejorResultado =  null;
		for (Estrategia estrategia : estrategias) {
			Double resultado = ejecutarOperaciones(new Agente(cantidadDineroEfectivo), estrategia, fechaInicial, registroOperaciones);
			if (mejorResultado == null || mejorResultado <= resultado) {
				mejorResultado = resultado;
				estrategiasGanadoras.clear();
				estrategiasGanadoras.add(estrategia);
			} 
		}
		return estrategiasGanadoras;
	}

	private double ejecutarOperaciones(Agente agente, Estrategia estrategia, DateTime fecha, RegistroOperaciones registroDeOperaciones) {
		DateTime primerDia = fecha;
		int ultimoDiaDelMes = fecha.dayOfMonth().getMaximumValue();
		//El primer dia no se realizan operaciones
		DateTime comienzoIntervalo = primerDia.plusDays(1);
		DateTime finIntervalo = fecha.plusDays(ultimoDiaDelMes-1);
		DateTime iteradorFecha = comienzoIntervalo;
		while (iteradorFecha.compareTo(finIntervalo) < 0) {
			for (String accion : Cotizaciones.acciones()) {
				Operacion operacion = estrategia.crearOperacion(accion, agente, iteradorFecha);
				operacion.operar(agente);
				registroDeOperaciones.registrarOperacion(operacion, estrategia);
			}
			iteradorFecha = iteradorFecha.plusDays(1);
		}
		
		//El ultimo dia se venden todas las acciones
		for (String accion : Cotizaciones.acciones()) {
			Operacion operacion = estrategia.crearVentaUltimoDia(accion, agente, iteradorFecha);
			operacion.operar(agente);
		}
		
		return agente.cantidadDineroEfectivo();
	}
}
