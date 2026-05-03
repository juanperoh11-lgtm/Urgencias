package Hospital;

public class Medicamento {

	private long id;
	private String nombre, principioActivo, dosis, contraDicciones, fabricantes;
	public Medicamento(long id, String nombre, String principioActivo, String dosis, String contraDicciones,
			String fabricantes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.principioActivo = principioActivo;
		this.dosis = dosis;
		this.contraDicciones = contraDicciones;
		this.fabricantes = fabricantes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrincipioActivo() {
		return principioActivo;
	}
	public void setPrincipioActivo(String principioActivo) {
		this.principioActivo = principioActivo;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	public String getContraDicciones() {
		return contraDicciones;
	}
	public void setContraDicciones(String contraDicciones) {
		this.contraDicciones = contraDicciones;
	}
	public String getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(String fabricantes) {
		this.fabricantes = fabricantes;
	}

}
