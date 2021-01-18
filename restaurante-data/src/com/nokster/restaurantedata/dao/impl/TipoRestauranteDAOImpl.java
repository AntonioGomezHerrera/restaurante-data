/**
 * 
 */
package com.nokster.restaurantedata.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.nokster.restaurantedata.conecction.ConnectionFactory;
import com.nokster.restaurantedata.dao.TipoRestauranteDAO;
import com.nokster.restaurantedata.entity.TipoRestaurante;

/**
 * @author Nokster Clase que implementa el CRUD y otros metodos personalizados
 *         de transacciones a la base de datos en la tabla tipo_restaurante
 */
public class TipoRestauranteDAOImpl implements TipoRestauranteDAO {

	static {
		try {
			ConnectionFactory.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.err.println("Error de bd: " + e.getMessage());
		}
	}

	@Override
	public int guardar(TipoRestaurante tipoRestaurante) throws SQLException {

		String sql = "INSERT INTO tipo_restaurante (descripcion, fechaCreacion, estatus) VALUES('"
				+ tipoRestaurante.getDescripcion() + "', '" + tipoRestaurante.getFechaCreacion() + "', "
				+ tipoRestaurante.isEstatus() + ");";
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		return ejecutado;
	}

	@Override
	public int actualizar(TipoRestaurante tipoRestaurante) throws SQLException {
		String sql = "UPDATE tipo_restaurante SET descripcion = '"+ tipoRestaurante.getDescripcion()
				+ "', fechaModificacion = '" + tipoRestaurante.getFechaModificacion() + "', estatus = "
				+ tipoRestaurante.isEstatus() + " WHERE idTipoRestaurante = " + tipoRestaurante.getIdTipoRestaurante()
				+ ";";
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		return ejecutado;
	}

	@Override
	public int eliminar(int idTipoRestaurante) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TipoRestaurante> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRestaurante consultarPorId(int idTipoRestaurante) {
		// TODO Auto-generated method stub
		return null;
	}

}
