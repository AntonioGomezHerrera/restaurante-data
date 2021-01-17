package com.nokster.restaurantedata.entity;

import java.time.LocalDateTime;

/**
 * 
 * @author Nokster 
 * Clase que contiene campos que se reutilizan en todas las
 *         clases que mapean en tablas
 */

public class CommonEntity {

	private LocalDateTime fechaCreacion;
	/**
	 * Fecha de modificacion del tipo de restaurante
	 */
	private LocalDateTime fechaModificacion;
	/**
	 * Estatus habilitado o deshabilitado del tipo de restaurante
	 */
	private boolean estatus;
	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}
	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
