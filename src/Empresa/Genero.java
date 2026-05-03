package Empresa;

public class Genero {

	private long id;
	private String nombre, Descripcion;

	public Genero(long id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		Descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
