/**
 * 
 */
package com.nokster.restaurantedata.conecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	 * Objeto encargado de habilitar y ejecutar las sentencias SQL
	 */
	private static Statement statement;

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
		statement = connection.createStatement(); // Habilitando proceso para ejecutar sentencias SQL

		return connection;
	}
	/**
	 * Permite ejecutar sentencias Insert, Update y Delete
	 * @param sql parametro con la sentencia a ejecutarse
	 * @return 1 en caso de ser exitoso, 0 en caso de error
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la senencia SQL
	 */
	public static int ejecutarSQL(String sql) throws SQLException {
		System.out.println("Query: " + sql);
		return statement.executeUpdate(sql);
	}
	
	/**
	 * Permite ejecutar sentencias Select
	 * @param sql parametro con la sentencia a ejecutarse
	 * @return objeto con la informacion obtenida de la sentencia Select
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la senencia SQL
	 */
	public static ResultSet ejecutarSQLSelect(String sql) throws SQLException {
		System.out.println("Query: " + sql);
		return statement.executeQuery(sql);
	}
}
