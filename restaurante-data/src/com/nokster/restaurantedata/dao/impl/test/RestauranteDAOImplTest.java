/**
 * 
 */
package com.nokster.restaurantedata.dao.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.nokster.restaurantedata.dao.impl.RestauranteDAOImpl;
import com.nokster.restaurantedata.entity.Menu;
import com.nokster.restaurantedata.entity.Restaurante;
import com.nokster.restaurantedata.entity.TipoRestaurante;

/**
 * @author Nokster
 * 
 */
class RestauranteDAOImplTest {

	@Test
	void testGuardar() {
		RestauranteDAOImpl restauranteDAOImpl = new RestauranteDAOImpl();
		
		Restaurante restaurante = new Restaurante();
		restaurante.setNombre("Restaurante Hiroshima");
		restaurante.setImagen("hiroshimares.png");
		restaurante.setEstatus(true);
		restaurante.setFechaCreacion(LocalDateTime.now());
		
		TipoRestaurante tipoRestaurante = new TipoRestaurante();
		tipoRestaurante.setIdTipoRestaurante(18);
		restaurante.setTipoRestaurante(tipoRestaurante);
		
		Menu menu = new Menu();
		menu.setIdMenu(4);
		restaurante.setMenu(menu);
		
		int guardado = 0;
		
		try {
			//Primer caso: Exitoso si guardado es mayor a 0
			guardado = restauranteDAOImpl.guardar(restaurante);
			
			assertTrue(guardado > 0);
			
			System.out.println("Se guardo exitosamente...");
			
		} catch (SQLException e) {
			//Segundo caso: Exitoso si no se guardo el restaurante por que hubo un error 
			assertTrue(guardado == 0);
			System.err.println("No se guardo...");
			e.printStackTrace();
		}
	}

}
