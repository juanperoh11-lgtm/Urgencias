package Empresa;

public class Bibliotecario {

	private long id;
	private String numEmpleado, nombre, apellidos, email, contrasella;

	public Bibliotecario(long id, String numEmpleado, String nombre, String apellidos, String email,
			String contrasella) {
		super();
		this.id = id;
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contrasella = contrasella;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasella() {
		return contrasella;
	}

	public void setContrasella(String contrasella) {
		this.contrasella = contrasella;
	}

}
