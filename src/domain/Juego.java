package domain;

import java.util.ArrayList;
import java.util.List;

public class Juego {

	private List<Usuario> usuarios;
	
	public Juego() {
		usuarios = new ArrayList<Usuario>();
	}

	public Integer cantidadUsuarios() {
		return usuarios.size();
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);		
	}

}
