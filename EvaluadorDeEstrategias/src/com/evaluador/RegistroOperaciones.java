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
	
	public int cantidadDeOperacionesDeUnaEstrategia(final Estrategia estrategia) {
		return this.contar(registros, new Closure<Registro>() {
			public boolean execute(Registro registro) {return registro.estrategia().equals(estrategia.nombreEstrategia());}
		});
	}

	public int cantidadDeCompras() {
		return this.contar(registros, new Closure<Registro>() {
			public boolean execute(Registro registro) {return registro.tipoOperacion().equals("Compra");}
		});
	}

	public int cantidadDeComprasDeUnaEstrategia(final Estrategia estrategia) {
		return this.contar(registros, new Closure<Registro>() {
			public boolean execute(Registro registro) {return registro.tipoOperacion().equals("Compra") && registro.estrategia().equals(estrategia.nombreEstrategia());}
		});
	}

	public int cantidadDeVentasDeUnaEstrategia(final Estrategia estrategia) {
		return this.contar(registros, new Closure<Registro>() {
			public boolean execute(Registro registro) {return registro.tipoOperacion().equals("Venta") && registro.estrategia().equals(estrategia.nombreEstrategia());}
		});
	}

	public int cantidadDeVentas() {
		return this.contar(registros, new Closure<Registro>() {
			public boolean execute(Registro registro) {return registro.tipoOperacion().equals("Venta");}
		});
	}
	
	public int contar(List<Registro> registros, Closure<Registro> condition) {
		int cantidad = 0;
		for (Registro registro : registros) {
			if (condition.execute(registro)) {
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
