package Hospital;

import java.time.LocalDate;

public class Historial_Clinico {

	private long id;
	private Paciente paciente;
	private LocalDate fechaCracion;
	private String observaciones;

	public Historial_Clinico(long id, Paciente paciente, LocalDate fechaCracion, String observaciones) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.fechaCracion = fechaCracion;
		this.observaciones = observaciones;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDate getFechaCracion() {
		return fechaCracion;
	}

	public void setFechaCracion(LocalDate fechaCracion) {
		this.fechaCracion = fechaCracion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
