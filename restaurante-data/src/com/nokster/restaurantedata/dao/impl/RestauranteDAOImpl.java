/**
 * 
 */
package com.nokster.restaurantedata.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.nokster.restaurantedata.conecction.ConnectionFactory;
import com.nokster.restaurantedata.dao.RestauranteDAO;
import com.nokster.restaurantedata.entity.Restaurante;
import com.nokster.restaurantedata.myexceptions.RestauranteException;

/**
 * @author Nokster Clase que implementa los metodos de CRUD de la interface
 *         RestauranteDAO
 *
 */
public class RestauranteDAOImpl implements RestauranteDAO {

	static {
		try {
			ConnectionFactory.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Error de Base de datos: " + e.getMessage());
		}
	}

	@Override
	public int guardar(Restaurante restaurante) throws SQLException {
		String sql = "insert into restaurante (nombre, imagen, slogan, idTipoRestaurante, fechaCreacion, estatus, idMenu) values ('"
				+ restaurante.getNombre() + "', '" + restaurante.getImagen() + "', '', "
				+ restaurante.getTipoRestaurante().getIdTipoRestaurante() + ", '" + restaurante.getFechaCreacion()
				+ "'," + restaurante.isEstatus() + "," + restaurante.getMenu().getIdMenu() + ");";
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		return ejecutado;
	}

	@Override
	public int actualizar(Restaurante restaurante) throws SQLException {
		String sql = "update restaurante set nombre = '" + restaurante.getNombre() + "', imagen = '"
				+ restaurante.getImagen() + "', slogan = '" + restaurante.getSlogan() + "', idTipoRestaurante = "
				+ restaurante.getTipoRestaurante().getIdTipoRestaurante() + ", fechaModificacion = '"
				+ restaurante.getFechaModificacion() + "', estatus = " + restaurante.isEstatus() + ", idMenu = "
				+ restaurante.getMenu().getIdMenu() + " where idRestaurante = " + restaurante.getIdRestaurante() + ";";
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		return ejecutado;
	}

	@Override
	public int eliminar(int idRestaurante) throws SQLException {
		String sql = "DELETE FROM restaurante where idRestaurante = "+ idRestaurante +"";
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		return ejecutado;
	}

	@Override
	public List<Restaurante> consultar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante consultarPorId(int idRestaurante) throws SQLException, RestauranteException {
		// TODO Auto-generated method stub
		return null;
	}

}
