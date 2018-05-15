package domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {

	private Usuario usuario;
	
	@Before
	public void setUp() throws Exception {
		usuario = new Usuario("Pablo", 24);
	}

	@Test
	public void testCreacionDeUsuario() {
		assertTrue(usuario.getNombre() == "Pablo");
		assertTrue(usuario.getEdad() == 24);
	}

}
