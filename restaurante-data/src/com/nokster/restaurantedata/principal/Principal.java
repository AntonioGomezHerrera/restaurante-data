/**
 * 
 */
package com.nokster.restaurantedata.principal;

import java.sql.Connection;
import java.sql.SQLException;

import com.nokster.restaurantedata.conecction.ConnectionFactory;

/**
 * @author Nokster
 * Clase principal para probar la conexion a la bd
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conexionGenerada = ConnectionFactory.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
