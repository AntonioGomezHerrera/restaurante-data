/**
 * 
 */
package com.nokster.restaurantedata.dao.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

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
	void testGuardarExitoso() {
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
			// Primer caso: Exitoso si guardo exitosamente
			guardado = restauranteDAOImpl.guardar(restaurante);

			assertTrue(guardado > 0);

			System.out.println("Se guardo exitosamente...");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testGuardarErrorenSQL() {
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
			// Primer caso: Exitoso si guardo exitosamente
			guardado = restauranteDAOImpl.guardar(restaurante);

		} catch (SQLException e) {
			// Segundo caso: Exitoso si no se guardo el restaurante por que hubo un error en
			// la sentencia SQL
			assertTrue(guardado == 0);
			System.err.println("No se guardo...");
			e.printStackTrace();
		}
	}

	@Test
	void testActualizarExitoso() {
		RestauranteDAOImpl restauranteDAOImpl = new RestauranteDAOImpl();

		Restaurante restaurante = new Restaurante();
		restaurante.setIdRestaurante(16);
		restaurante.setNombre("Restaurante Tokyo");
		restaurante.setImagen("tokyores.png");
		restaurante.setEstatus(true);
		restaurante.setSlogan("");
		restaurante.setFechaModificacion(LocalDateTime.now());

		TipoRestaurante tipoRestaurante = new TipoRestaurante();
		tipoRestaurante.setIdTipoRestaurante(18);
		restaurante.setTipoRestaurante(tipoRestaurante);
		
		assertTrue(restaurante.getTipoRestaurante().getIdTipoRestaurante() == 18);

		Menu menu = new Menu();
		menu.setIdMenu(4);
		restaurante.setMenu(menu);
		
		assertTrue(restaurante.getMenu().getIdMenu() == 4);

		int actualizado = 0;

		try {
			// Primer caso: Exitoso si guardo exitosamente
			actualizado = restauranteDAOImpl.actualizar(restaurante);

			assertTrue(actualizado > 0);
			System.out.println("Se actualizo el restaurante exitosamente...");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testEliminarExitoso() {
		int idRestaurante = 20;
		
		RestauranteDAOImpl restauranteDAOImpl = new RestauranteDAOImpl();
		try {
			
			assertTrue(idRestaurante == 20);
			
			int eliminado = restauranteDAOImpl.eliminar(idRestaurante);
			
			assertTrue(eliminado > 0);
			System.out.println("Se elimino el Restaurante de forma exitosa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testConsultarExitoso() {
		RestauranteDAOImpl restauranteDAOImpl = new RestauranteDAOImpl();
		
		try {
			List<Restaurante> restaurantesConsultados = restauranteDAOImpl.consultar();
			
			assertTrue(restaurantesConsultados.size() > 0);
			
			for (Restaurante restaurante : restaurantesConsultados) {
				System.out.println("NOMBRE DEL RESTAURANTE: " + restaurante.getNombre());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
