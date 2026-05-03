package Empresa;

import java.time.LocalDate;

public class Prestamo {

	private long id;
	private Socio socio;
	private Ejemplar ejemplar;
	private Bibliotecario bibliotecario;
	private LocalDate fechaInicio, FechaDevolucion, fechaDevuelto;
	private boolean renovado;

	public Prestamo(long id, Socio socio, Ejemplar ejemplar, Bibliotecario bibliotecario, LocalDate fechaInicio,
			LocalDate fechaDevolucion, LocalDate fechaDevuelto, boolean renovado) {
		super();
		this.id = id;
		this.socio = socio;
		this.ejemplar = ejemplar;
		this.bibliotecario = bibliotecario;
		this.fechaInicio = fechaInicio;
		FechaDevolucion = fechaDevolucion;
		this.fechaDevuelto = fechaDevuelto;
		this.renovado = renovado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Ejemplar getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaDevolucion() {
		return FechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		FechaDevolucion = fechaDevolucion;
	}

	public LocalDate getFechaDevuelto() {
		return fechaDevuelto;
	}

	public void setFechaDevuelto(LocalDate fechaDevuelto) {
		this.fechaDevuelto = fechaDevuelto;
	}

	public boolean isRenovado() {
		return renovado;
	}

	public void setRenovado(boolean renovado) {
		this.renovado = renovado;
	}

}
