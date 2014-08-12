package com.evaluador;

import org.joda.time.DateTime;

public class ClaveCompuesta {

	private String accion;
	private DateTime fecha;

	public ClaveCompuesta(String accion, DateTime fecha) {
		this.accion = accion;
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accion == null) ? 0 : accion.hashCode());
		result = prime * result
				+ ((fecha == null) ? 0 : fecha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClaveCompuesta other = (ClaveCompuesta) obj;
		if (accion == null) {
			if (other.accion != null)
				return false;
		} else if (!accion.equals(other.accion))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.withTimeAtStartOfDay().isEqual(other.fecha.withTimeAtStartOfDay()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClaveCompuesta [accion=" + accion + ", fechaVenta="
				+ fecha + "]";
	}

	public String accion() {
		return accion;
	}

	public DateTime fecha() {
		return fecha;
	}
}
