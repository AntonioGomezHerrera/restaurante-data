/**
 * 
 */
package com.nokster.restaurantedata.entity;

import java.time.LocalDateTime;

/**
 * @author Nokster
 * Clase que representa una entidad de tipo restaurante en la base de datos
 */
public class TipoRestaurante {
	
	/**
	 * Identificador del tipo de restaurante
	 */
	private int idTipoRestaurante;
	/**
	 * Descripcion del tipo de restaurante
	 */
	private String descripcion;
	/**
	 * Fecha de creacion del tipo de restaurante
	 */
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
	 * @return the idTipoRestaurante
	 */
	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}
	/**
	 * @param idTipoRestaurante the idTipoRestaurante to set
	 */
	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
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
