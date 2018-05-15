package domain;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;


public class JuegoTest {

	private Juego juego;
	private Usuario usuarioMock;

	@Before
	public void setUp() throws Exception {
		juego = new Juego();
		usuarioMock = mock(Usuario.class);
	}

	@Test
	public void testCreacionalJuego() {
		assertTrue(juego.cantidadUsuarios() == 0);
	}
	
	@Test
	public void testAgregoUnUsuarioAlJuego() {
		juego.agregarUsuario(usuarioMock);
		assertTrue(juego.cantidadUsuarios() == 1);
	}

}
