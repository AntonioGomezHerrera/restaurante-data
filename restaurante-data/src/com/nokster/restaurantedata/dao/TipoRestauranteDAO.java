/**
 * 
 */
package com.nokster.restaurantedata.dao;

import java.sql.SQLException;
import java.util.List;

import com.nokster.restaurantedata.entity.TipoRestaurante;

/**
 * @author Nokster Interface que representa el CRUD de transaccion para la tabla
 *         de tipo_restaurante
 */
public interface TipoRestauranteDAO {

	/**
	 * Metodo que permite guardar registros de Tipos de restaurantes
	 * 
	 * @param tipoRestaurante objeto a guardar
	 * @return 1 o mas de en caso de ser exitoso, 0 en caso de no guardarlo
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la sentencia SQL
	 */
	int guardar(TipoRestaurante tipoRestaurante) throws SQLException;

	/**
	 * Metodo que permite actualizar registros de Tipos de restaurantes
	 * 
	 * @param tipoRestaurante objeto a actualizar
	 * @return 1 o mas de en caso de ser exitoso, 0 en caso de no actualizarlo
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la sentencia SQL
	 */
	int actualizar(TipoRestaurante tipoRestaurante) throws SQLException;

	/**
	 * Metodo que permire eliminar registros de Tipos de restaurantes
	 * 
	 * @param idTipoRestaurante identificador del tipo a eliminar
	 * @return 1 o mas de en caso de ser exitoso, 0 en caso de no guardarlo
	 */
	int eliminar(int idTipoRestaurante);
	/**
	 * Metodo que permite consultar los registros de tipos de restaurantes
	 * @return lista de tipos de restaurantes 
	 */
	List<TipoRestaurante> consultar();
	
	/**
	 * Metodo que permite consultar 1 registro de tipo restaurante por identificador
	 * @param idTipoRestaurante identificador del tipo
	 * @return tipo de restaurante consultado o null
	 */
	TipoRestaurante consultarPorId(int idTipoRestaurante);
}
