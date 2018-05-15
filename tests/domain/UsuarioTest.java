package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {

	private Usuario usuario;
	
	@BeforeEach
	void setUp() throws Exception {
		usuario = new Usuario("Pablo", 24);
	}

	@Test
	void testCreacionDeUsuario() {
		assertTrue(usuario.getNombre() == "Pablo");
		assertTrue(usuario.getEdad() == 24);
	}

}
