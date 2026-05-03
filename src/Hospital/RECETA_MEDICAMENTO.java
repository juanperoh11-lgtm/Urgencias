package Hospital;

public class RECETA_MEDICAMENTO {
	private long id;
	private Receta receta;
	private Medicamento medicamento;
	private String dodisPersonalizada;
	private int frecuenciaDias, duraciónDias;

	public RECETA_MEDICAMENTO(long id, Receta receta, Medicamento medicamento, String dodisPersonalizada,
			int frecuenciaDias, int duraciónDias) {
		super();
		this.id = id;
		this.receta = receta;
		this.medicamento = medicamento;
		this.dodisPersonalizada = dodisPersonalizada;
		this.frecuenciaDias = frecuenciaDias;
		this.duraciónDias = duraciónDias;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public String getDodisPersonalizada() {
		return dodisPersonalizada;
	}

	public void setDodisPersonalizada(String dodisPersonalizada) {
		this.dodisPersonalizada = dodisPersonalizada;
	}

	public int getFrecuenciaDias() {
		return frecuenciaDias;
	}

	public void setFrecuenciaDias(int frecuenciaDias) {
		this.frecuenciaDias = frecuenciaDias;
	}

	public int getDuraciónDias() {
		return duraciónDias;
	}

	public void setDuraciónDias(int duraciónDias) {
		this.duraciónDias = duraciónDias;
	}

}
