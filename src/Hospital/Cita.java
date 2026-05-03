package Hospital;

import java.time.LocalDateTime;

public class Cita {

	private long id;
	private Paciente paciente;
	private Medico medico;
	private Especialidad especialidad;
	private LocalDateTime fechaHora;
	private String sala, estado;

	public Cita(long id, Paciente paciente, Medico medico, Especialidad especialidad, LocalDateTime fechaHora,
			String sala, String estado) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.medico = medico;
		this.especialidad = especialidad;
		this.fechaHora = fechaHora;
		this.sala = sala;
		this.estado = estado;
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

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
