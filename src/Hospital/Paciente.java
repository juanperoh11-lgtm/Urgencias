package Hospital;

import java.time.LocalDate;

public class Paciente {

	private long id;
	private String dni;
	private String nombre, apellidos, telefono, email, SeguroMedico;
	private LocalDate fechaNacimiento;

	public Paciente(long id, String dni, String nombre, String apellidos, String telefono, String email,
			String seguroMedico, LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		SeguroMedico = seguroMedico;
		this.fechaNacimiento = fechaNacimiento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSeguroMedico() {
		return SeguroMedico;
	}

	public void setSeguroMedico(String seguroMedico) {
		SeguroMedico = seguroMedico;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
