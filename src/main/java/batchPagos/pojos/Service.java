package batchPagos.pojos;

public class Service {

	private String descripcion;
	private String clave;
	private String tipoServicio;
	private double importe;
	private double iva;
	private double total;
	private long invoiceDetailId;

	public Service() {
	}

	public Service(String descripcion, String clave, double importe, double iva, double total) {
		super();
		this.descripcion = descripcion;
		this.clave = clave;
		this.importe = importe;
		this.iva = iva;
		this.total = total;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public long getInvoiceDetailId() {
		return invoiceDetailId;
	}

	public void setInvoiceDetailId(long invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

	@Override
	public String toString() {
		return "Service [descripcion=" + descripcion + ", clave=" + clave + ", tipoServicio=" + tipoServicio
				+ ", importe=" + importe + ", iva=" + iva + ", total=" + total + "]";
	}

}
