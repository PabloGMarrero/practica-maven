package domain;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JuegoTest {

	private Juego juego;
	private Usuario usuarioMock;

	@BeforeEach
	void setUp() throws Exception {
		juego = new Juego();
		usuarioMock = mock(Usuario.class);
	}

	@Test
	void testCreacionalJuego() {
		assertTrue(juego.cantidadUsuarios() == 0);
	}
	
	@Test
	void testAgregoUnUsuarioAlJuego() {
		juego.agregarUsuario(usuarioMock);
		assertTrue(juego.cantidadUsuarios() == 1);
	}

}
