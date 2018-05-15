package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JuegoTest {

	private Juego juego;

	@BeforeEach
	void setUp() throws Exception {
		juego = new Juego();
	}

	@Test
	void testCreacionalJuego() {
		assertTrue(juego.cantidadUsuarios() == 0);
	}

}
