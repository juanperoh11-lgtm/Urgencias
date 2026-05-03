package Hospital;

import java.time.LocalDate;

public class ORDEN_INGRESO {

	private long id;
	private Diagnostico diagnostico_id;
	private LocalDate fechaEmision;
	private String motivoIngreso, UnidadHospitalaria, estado;

	public ORDEN_INGRESO(long id, Diagnostico diagnostico_id, LocalDate fechaEmision, String motivoIngreso,
			String unidadHospitalaria, String estado) {
		super();
		this.id = id;
		this.diagnostico_id = diagnostico_id;
		this.fechaEmision = fechaEmision;
		this.motivoIngreso = motivoIngreso;
		UnidadHospitalaria = unidadHospitalaria;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Diagnostico getDiagnostico_id() {
		return diagnostico_id;
	}

	public void setDiagnostico_id(Diagnostico diagnostico_id) {
		this.diagnostico_id = diagnostico_id;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getMotivoIngreso() {
		return motivoIngreso;
	}

	public void setMotivoIngreso(String motivoIngreso) {
		this.motivoIngreso = motivoIngreso;
	}

	public String getUnidadHospitalaria() {
		return UnidadHospitalaria;
	}

	public void setUnidadHospitalaria(String unidadHospitalaria) {
		UnidadHospitalaria = unidadHospitalaria;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
