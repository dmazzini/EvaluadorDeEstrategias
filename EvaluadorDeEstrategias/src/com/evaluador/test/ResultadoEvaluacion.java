package com.evaluador.test;

import java.util.Set;

import com.evaluador.Estrategia;
import com.evaluador.RegistroOperaciones;

public class ResultadoEvaluacion {

	private final Set<Estrategia> estrategiasGanadoras;
	private final RegistroOperaciones registroOperaciones;

	public ResultadoEvaluacion(Set<Estrategia> estrategiasGanadoras, RegistroOperaciones registroOperaciones) {
				this.estrategiasGanadoras = estrategiasGanadoras;
				this.registroOperaciones = registroOperaciones;
	}

	public boolean esEstrategiaGanadora(Estrategia estrategia) {
		return this.estrategiasGanadoras.contains(estrategia);
	}

	public void listarRegistros() {
		this.registroOperaciones.listarOperaciones();
	}

}
