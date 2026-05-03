package Hospital;

import java.time.LocalDate;

public class Diagnostico {

	private long id;
	private Historial_Clinico historialClinico;
	private Medico medico;
	private LocalDate fecha;
	private String descripcion, tratamiento, observaciones;

	public Diagnostico(long id, Historial_Clinico historialClinico, Medico medico, LocalDate fecha, String descripcion,
			String tratamiento, String observaciones) {
		super();
		this.id = id;
		this.historialClinico = historialClinico;
		this.medico = medico;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.tratamiento = tratamiento;
		this.observaciones = observaciones;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Historial_Clinico getHistorialClinico() {
		return historialClinico;
	}

	public void setHistorialClinico(Historial_Clinico historialClinico) {
		this.historialClinico = historialClinico;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
