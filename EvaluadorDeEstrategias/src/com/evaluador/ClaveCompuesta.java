package com.evaluador;

import org.joda.time.DateTime;

public class ClaveCompuesta {

	private String accion;
	private DateTime fechaVenta;

	public ClaveCompuesta(String accion, DateTime fechaVenta) {
		this.accion = accion;
		this.fechaVenta = fechaVenta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accion == null) ? 0 : accion.hashCode());
		result = prime * result
				+ ((fechaVenta == null) ? 0 : fechaVenta.hashCode());
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
		if (fechaVenta == null) {
			if (other.fechaVenta != null)
				return false;
		} else if (!fechaVenta.withTimeAtStartOfDay().isEqual(other.fechaVenta.withTimeAtStartOfDay()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClaveCompuesta [accion=" + accion + ", fechaVenta="
				+ fechaVenta + "]";
	}

	public String accion() {
		return accion;
	}

	
}
