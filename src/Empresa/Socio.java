package Empresa;

import java.time.LocalDate;

public class Socio {
	private long id;
	private String numSocio, nombre, apellidos, email, telefono, tipoMembresia;
	private LocalDate Alta;
	private boolean activo;

	public Socio(long id, String numSocio, String nombre, String apellidos, String email, String telefono,
			String tipoMembresia, LocalDate alta, boolean activo) {
		super();
		this.id = id;
		this.numSocio = numSocio;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.tipoMembresia = tipoMembresia;
		Alta = alta;
		this.activo = activo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(String numSocio) {
		this.numSocio = numSocio;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoMembresia() {
		return tipoMembresia;
	}

	public void setTipoMembresia(String tipoMembresia) {
		this.tipoMembresia = tipoMembresia;
	}

	public LocalDate getAlta() {
		return Alta;
	}

	public void setAlta(LocalDate alta) {
		Alta = alta;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
