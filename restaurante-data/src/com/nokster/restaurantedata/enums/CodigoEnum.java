/**
 * 
 */
package com.nokster.restaurantedata.enums;

/**
 * @author Nokster
 * Enumeracion que contine los codigos de error del aplicativo
 */
public enum CodigoEnum {
	/**
	 * Constante con el codigo de error de sintaxis
	 */
	SINTAXIS_ERROR_CODE(1064);
	/**
	 * Codigo de error
	 */
	private int code;

	/**
	 * Constructor privado default de la enumeracion
	 * @param code codigo del error generado
	 */
	CodigoEnum(int code) {
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
}
