package Hospital;

import java.time.LocalDate;

public class Receta {

	private long id;
	private Diagnostico diagnostico;
	private Medico medico;
	private LocalDate fechaemision, fechaVencimiento;
	private String instrucciones;

	public Receta(long id, Diagnostico diagnostico, Medico medico, LocalDate fechaemision, LocalDate fechaVencimiento,
			String instrucciones) {
		super();
		this.id = id;
		this.diagnostico = diagnostico;
		this.medico = medico;
		this.fechaemision = fechaemision;
		this.fechaVencimiento = fechaVencimiento;
		this.instrucciones = instrucciones;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public LocalDate getFechaemision() {
		return fechaemision;
	}

	public void setFechaemision(LocalDate fechaemision) {
		this.fechaemision = fechaemision;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

}
