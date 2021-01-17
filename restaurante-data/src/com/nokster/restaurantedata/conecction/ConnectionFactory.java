/**
 * 
 */
package com.nokster.restaurantedata.conecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Nokster Clase que se encarga de realizar la configuracion, la
 *         conexion y habilitar las transacciones de una base de datos
 */
public class ConnectionFactory {

	/**
	 * Objeto encargado de mantener la conexion de la bd
	 */
	private static Connection connection;

	/**
	 * Metodo que permite conectarse a la bd
	 * 
	 * @return objeto Connection con la informacion de la bd conectada | null
	 * @throws ClassNotFoundException excepcion generada al no cargar el driver de
	 *                                conexion
	 * @throws SQLException           Excepcion generada al no conectarse a la bd
	 */

	public static Connection conectar() throws ClassNotFoundException, SQLException {
		// Cargar el driver de conexion
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Paso 2: Establecer los datos de la conexion
		String url = "jdbc:mysql://localhost/restaurante";
		String user = "root";
		String password = "";

		// Paso 3: Establecer la conexion
		connection = DriverManager.getConnection(url, user, password);

		return connection;
	}
}
