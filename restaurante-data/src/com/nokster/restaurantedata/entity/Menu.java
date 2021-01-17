/**
 * 
 */
package com.nokster.restaurantedata.entity;

/**
 * @author Nokster
 * Clase que representa una entidad de menu de la bd
 */
public class Menu extends CommonEntity {
	/**
	 * Identificador del menú
	 */
	private int idMenu;
	/**
	 * Clave del menú
	 */
	private String clave;
	/**
	 * Descripcion del menu
	 */
	private String descripcion;
	/**
	 * @return the idMenu
	 */
	public int getIdMenu() {
		return idMenu;
	}
	/**
	 * @param idMenu the idMenu to set
	 */
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
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
}
