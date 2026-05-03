package Hospital;

import java.time.LocalDate;

public class Factura {
	private long id;
	private Cita cita;
	private LocalDate fechaEmision;
	private double importe;
	private String tipoServicio, estadoPago;
	public Factura(long id, Cita cita, LocalDate fechaEmision, double importe, String tipoServicio, String estadoPago) {
		super();
		this.id = id;
		this.cita = cita;
		this.fechaEmision = fechaEmision;
		this.importe = importe;
		this.tipoServicio = tipoServicio;
		this.estadoPago = estadoPago;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Cita getCita() {
		return cita;
	}
	public void setCita(Cita cita) {
		this.cita = cita;
	}
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public String getEstadoPago() {
		return estadoPago;
	}

	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}
	
}
