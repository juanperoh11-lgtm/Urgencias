package Empresa;

public class Editorial {

	private long id;
	private String nombre, pais, email;

	public Editorial(long id, String nombre, String pais, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.email = email;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
