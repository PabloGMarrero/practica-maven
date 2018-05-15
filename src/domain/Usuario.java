package domain;

public class Usuario {

	private String nombre;
	private Integer edad;

	public Usuario(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Integer getEdad() {
		return this.edad;
	}
}
