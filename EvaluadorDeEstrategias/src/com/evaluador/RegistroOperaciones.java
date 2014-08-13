package com.evaluador;

import java.util.ArrayList;
import java.util.List;

public class RegistroOperaciones {

	private List<Registro> registros;

	public RegistroOperaciones() {
		registros = new ArrayList<Registro>();
	}

	public void registrarOperacion(Operacion operacion, Estrategia estrategia) {
		Registro registroNuevo = new Registro(operacion.tipoOperacion(),
										operacion.accion, 
										operacion.cantidad, 
										operacion.cotizacion,
										operacion.fecha, 
										estrategia.nombreEstrategia());
		registros.add(registroNuevo);
	}
	
	public int cantidadDeOperacionesDeUnaEstrategia(Estrategia estrategia) {
		int cantidad = 0;
		for (Registro registro : registros) {
			if (registro.estrategia().equals(estrategia.nombreEstrategia())) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int cantidadDeCompras() {
		int cantidad = 0;
		for (Registro registro : registros) {
			if (registro.tipoOperacion().equals("Compra")) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int cantidadDeComprasDeUnaEstrategia(Estrategia estrategia) {
		int cantidad = 0;
		for (Registro registro : registros) {
			if (registro.tipoOperacion().equals("Compra") && registro.estrategia().equals(estrategia.nombreEstrategia())) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int cantidadDeVentasDeUnaEstrategia(Estrategia estrategia) {
		int cantidad = 0;
		for (Registro registro : registros) {
			if (registro.tipoOperacion().equals("Venta") && registro.estrategia().equals(estrategia.nombreEstrategia())) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int cantidadDeVentas() {
		int cantidad = 0;
		for (Registro registro : registros) {
			if (registro.tipoOperacion().equals("Venta")) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public void listarOperaciones() {
		for (Registro registro : registros) {
			System.out.println(registro);
		}
	}
	
	
}
