package com.evaluador;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.joda.time.DateTime;

public class Acciones {

	private Set<Accion> conjuntoDeAcciones;
	
	public Acciones() {
		conjuntoDeAcciones = new HashSet<Accion>();
	}

	public void guardarAccionesCompradas(String accion, Integer cantidadAccionesCompradas, DateTime fecha) {
		conjuntoDeAcciones.add(new Accion(accion, cantidadAccionesCompradas, fecha));
	}

	public void quitarAccionesVendidas(String nombreAccion) {
		Iterator<Accion> iterator = conjuntoDeAcciones.iterator();
		while (iterator.hasNext()) {
			if(iterator.next().getNombre().equals(nombreAccion)) {
				iterator.remove();
			}
		}
	}

	public Integer cantidadDeAccionesDeUnaEmpresa(String nombreAccion) {
		Integer cantidadDeAcciones = 0;
		for (Accion accion : conjuntoDeAcciones) {
			if(accion.getNombre().equals(nombreAccion)) {
				cantidadDeAcciones += accion.getCantidad();
			}
		}
		return cantidadDeAcciones;
	}

	public DateTime fechaDeAccionMasAntigua(String nombreAccion) {
		DateTime fechaDeAccionMasAntigua = null;
		for (Accion accion : conjuntoDeAcciones) {
			if(accion.getNombre().equals(nombreAccion)) {
				if (fechaDeAccionMasAntigua == null || fechaDeAccionMasAntigua.isAfter(accion.getFecha())) {
					fechaDeAccionMasAntigua = accion.getFecha();
				}
			}
		}
		return fechaDeAccionMasAntigua;
	}

	
	
//	private Map<String, Integer> acciones;
//	
//	public Acciones() {
//		acciones = new HashMap<String, Integer>();
//	}
//
//	public void guardarAccionesCompradas(String accion, Integer cantidadAccionesCompradas) {
//		Integer cantidadAcciones;
//		if(acciones.containsKey(accion)) {
//			cantidadAcciones = acciones.get(accion) + cantidadAccionesCompradas;
//		} else {
//			cantidadAcciones = cantidadAccionesCompradas;
//		}
//		acciones.put(accion, cantidadAcciones);
//	}
//
//	public void quitarAccionesVendidas(String accion) {
//		acciones.put(accion, 0);
//	}
//
//	public Integer cantidadDeAcciones(String accion) {
//		Integer ret;
//		if(acciones.containsKey(accion)) {
//			ret = acciones.get(accion);
//		} else {
//			ret = 0;
//		}
//		return ret;
//	}
//
//	public DateTime fechaDeCompra(String accion) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
