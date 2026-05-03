package Empresa;

public class Fondo {

	private long id;
	private Genero genero;
	private Editorial editorial;
	private String tituolo, autor, isbn;
	private int anioPublicacion;
	private String tipoFondo;
	private int numEjemplares;

	public Fondo(long id, Genero genero, Editorial editorial, String tituolo, String autor, String isbn,
			int anioPublicacion, String tipoFondo, int numEjemplares) {
		super();
		this.id = id;
		this.genero = genero;
		this.editorial = editorial;
		this.tituolo = tituolo;
		this.autor = autor;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
		this.tipoFondo = tipoFondo;
		this.numEjemplares = numEjemplares;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public String getTituolo() {
		return tituolo;
	}

	public void setTituolo(String tituolo) {
		this.tituolo = tituolo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getTipoFondo() {
		return tipoFondo;
	}

	public void setTipoFondo(String tipoFondo) {
		this.tipoFondo = tipoFondo;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

}
