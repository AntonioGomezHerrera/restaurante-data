/**
 * 
 */
package com.nokster.restaurantedata.dao;

import java.sql.SQLException;
import java.util.List;

import com.nokster.restaurantedata.entity.Restaurante;
import com.nokster.restaurantedata.myexceptions.RestauranteException;

/**
 * @author Nokster Interface que proporciona CRUD para las transacciones hacia
 *         la bd en la tabla restaurante
 */
public interface RestauranteDAO {

	/**
	 * Metodo que permite guardar registros de Tipos de restaurantes
	 * 
	 * @param restaurante objeto a guardar
	 * @return 1 o mas de en caso de ser exitoso, 0 en caso de no guardarlo
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la
	 *                      sentencia SQL
	 */
	int guardar(Restaurante restaurante) throws SQLException;

	/**
	 * Metodo que permite actualizar registros de Tipos de restaurantes
	 * 
	 * @param Restaurante objeto a actualizar
	 * @return 1 o mas de en caso de ser exitoso, 0 en caso de no actualizarlo
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la
	 *                      sentencia SQL
	 */
	int actualizar(Restaurante restaurante) throws SQLException;

	/**
	 * Metodo que permire eliminar registros de Tipos de restaurantes
	 * 
	 * @param idRestaurante identificador del tipo a eliminar
	 * @return 1 o mas de en caso de ser exitoso, 0 en caso de no guardarlo
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la
	 *                      sentencia SQL
	 */
	int eliminar(int idRestaurante) throws SQLException;

	/**
	 * Metodo que permite consultar los registros de tipos de restaurantes
	 * 
	 * @return lista de tipos de restaurantes
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la
	 *                      sentencia SQL
	 */
	List<Restaurante> consultar() throws SQLException;

	/**
	 * Metodo que permite consultar 1 registro de tipo restaurante por identificador
	 * 
	 * @param idRestaurante identificador del tipo
	 * @return tipo de restaurante consultado o null
	 * @throws SQLException         Excepcion generada en caso de error al ejecutar
	 *                              la sentencia SQL
	 * @throws RestauranteException Excepcion personalizada que genera un mensaje
	 *                              mas especifico
	 */
	Restaurante consultarPorId(int idRestaurante) throws SQLException, RestauranteException;
}
