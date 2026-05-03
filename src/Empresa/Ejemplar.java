package Empresa;

public class Ejemplar {

	private long id;
	private Fondo fondo;
	private String codigoBarras, sala, asignatura, estado;

	public Ejemplar(long id, Fondo fondo, String codigoBarras, String sala, String asignatura, String estado) {
		super();
		this.id = id;
		this.fondo = fondo;
		this.codigoBarras = codigoBarras;
		this.sala = sala;
		this.asignatura = asignatura;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Fondo getFondo() {
		return fondo;
	}

	public void setFondo(Fondo fondo) {
		this.fondo = fondo;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
