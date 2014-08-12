package com.evaluador;

import java.util.ArrayList;
import java.util.List;

public class RegistroOperaciones {

	private List<Operacion> operaciones;

	public RegistroOperaciones() {
		operaciones = new ArrayList<Operacion>();
	}
	
	public int cantidadDeOperacionesDeUnaEstrategia(Estrategia estrategia1) {
		return operaciones.size();
	}

	public void registrarOperacion(Operacion operacion, Estrategia estrategia) {
		operaciones.add(operacion);
	}

}
