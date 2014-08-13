package com.evaluador;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;

import com.evaluador.test.ResultadoEvaluacion;

public class EvaluadorDeEstrategias {

	public ResultadoEvaluacion evaluarEstrategias(Double cantidadDineroEfectivo, Set<Estrategia> estrategias, int mes, int anio) {
		DateTime fechaInicial = new DateTime(anio, mes, 1, 0, 0);
		RegistroOperaciones registroOperaciones = new RegistroOperaciones();
		Set<Estrategia> estrategiasGanadoras = new HashSet<Estrategia>();
		Double mejorResultado =  null;
		for (Estrategia estrategia : estrategias) {
			Double resultado = ejecutarOperaciones(new Agente(cantidadDineroEfectivo), estrategia, fechaInicial, registroOperaciones);
			if (mejorResultado == null)  {
				mejorResultado = resultado;
				estrategiasGanadoras.add(estrategia);
			} else if (mejorResultado.equals(resultado)) {
				estrategiasGanadoras.add(estrategia);				
			} else if (mejorResultado < resultado) {
				mejorResultado = resultado;
				estrategiasGanadoras.clear();
				estrategiasGanadoras.add(estrategia);
			}
		}
		return new ResultadoEvaluacion(estrategiasGanadoras, registroOperaciones);
	}

	private double ejecutarOperaciones(Agente agente, Estrategia estrategia, DateTime fecha, RegistroOperaciones registroDeOperaciones) {
		DateTime iteradorFecha = fecha;
		DateTime finIntervalo = fecha.plusDays(fecha.dayOfMonth().getMaximumValue());
		while (iteradorFecha.isBefore(finIntervalo)) {
			for (String accion : Cotizaciones.acciones()) {
				Operacion operacion = estrategia.crearOperacion(accion, agente, iteradorFecha);
				operacion.operar(agente);
				registroDeOperaciones.registrarOperacion(operacion, estrategia);
			}
			iteradorFecha = iteradorFecha.plusDays(1);
		}
		return agente.cantidadDineroEfectivo();
	}
}
