/**
 * 
 */
package com.nokster.restaurantedata.principal;

import java.sql.SQLException;
import java.time.LocalDateTime;

import com.nokster.restaurantedata.dao.impl.TipoRestauranteDAOImpl;
import com.nokster.restaurantedata.entity.TipoRestaurante;

/**
 * @author Nokster Clase principal para probar la conexion a la bd
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TipoRestauranteDAOImpl tipoRestauranteImpl = new TipoRestauranteDAOImpl();

		

		// ::::::::: Preba de INSERT
		
//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setDescripcion("Griego");
//		tipoRestaurante.setFechaCreacion(LocalDateTime.now());
//		tipoRestaurante.setEstatus(true);

//		try {
//			int guardado = tipoRestauranteImpl.guardar(tipoRestaurante);
//
//			// Si el tipo de restaurante se guardo en la bd
//			if (guardado > 0) {
//				System.out.println(
//						"El tipo de Restaurante " + tipoRestaurante.getDescripcion() + " fue guardado exitosamente");
//			} else {
//				System.err.println("Hubo un error al guardar el tipo de restaurante");
//			}
//
//		} catch (SQLException e) {
//			System.err.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}

		// ::::::::::::::::::::: Prueba de UPDATE
		
//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setIdTipoRestaurante(22);
//		tipoRestaurante.setDescripcion("Griego");
//		tipoRestaurante.setFechaModificacion(LocalDateTime.now());
//		tipoRestaurante.setEstatus(false);

//		try {
//			int guardado = tipoRestauranteImpl.actualizar(tipoRestaurante);
//
//			// Si el tipo de restaurante se guardo en la bd
//			if (guardado > 0) {
//				System.out.println(
//						"El tipo de Restaurante " + tipoRestaurante.getDescripcion() + " fue actualizado exitosamente");
//			} else {
//				System.err.println("Hubo un error al actualizar el tipo de restaurante");
//			}
//
//		} catch (SQLException e) {
//			System.err.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		//:::::::::::::: Prueba de DELETE
		
		TipoRestaurante tipoRestaurante = new TipoRestaurante();
		tipoRestaurante.setIdTipoRestaurante(22);
		tipoRestaurante.setDescripcion("Griego");
		
		try {
			int eliminado = tipoRestauranteImpl.eliminar(tipoRestaurante.getIdTipoRestaurante());

			// Si el tipo de restaurante se guardo en la bd
			if (eliminado > 0) {
				System.out.println(
						"El tipo de Restaurante fue "+ tipoRestaurante.getDescripcion() +" eliminado exitosamente");
			} else {
				System.err.println("Hubo un error al eliminar el tipo de restaurante");
			}

		} catch (SQLException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
