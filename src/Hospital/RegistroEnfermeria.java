package Hospital;

import java.time.LocalDateTime;

public class RegistroEnfermeria {
	private long id;
	private Paciente paciente;
	private LocalDateTime fechaHora;
	private double presionSistolica, presionDiastolica, temperatura, frecuenciaCardiaca;
	private String observaciones;

	public RegistroEnfermeria(long id, Paciente paciente, LocalDateTime fechaHora, double presionSistolica,
			double presionDiastolica, double temperatura, double frecuenciaCardiaca, String observaciones) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.fechaHora = fechaHora;
		this.presionSistolica = presionSistolica;
		this.presionDiastolica = presionDiastolica;
		this.temperatura = temperatura;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
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

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public double getPresionSistolica() {
		return presionSistolica;
	}

	public void setPresionSistolica(double presionSistolica) {
		this.presionSistolica = presionSistolica;
	}

	public double getPresionDiastolica() {
		return presionDiastolica;
	}

	public void setPresionDiastolica(double presionDiastolica) {
		this.presionDiastolica = presionDiastolica;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
