package Empresa;

import java.time.LocalDate;

public class Reserva {

	private long id;
	private Socio socio;
	private Fondo fondo;
	private LocalDate fechaReserva;
	private String estado;

	public Reserva(long id, Socio socio, Fondo fondo, LocalDate fechaReserva, String estado) {
		super();
		this.id = id;
		this.socio = socio;
		this.fondo = fondo;
		this.fechaReserva = fechaReserva;
		this.estado = estado;
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

	public Fondo getFondo() {
		return fondo;
	}

	public void setFondo(Fondo fondo) {
		this.fondo = fondo;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
