package batchPagos.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Invoice {

	private List<Service> conceptos = new ArrayList<Service>();
	private Date fechaFactura;
	private String numeroFactura;
	private String cuenta;
	private String ciclo;
	private double importe;
	private double openAmount;
	private double iva;
	private double total;
	private String estatus;
	private String accountKey;
	private long invoiceId;
	private String transType;
	private String importeLayoutHuawei;
	private String importeLayoutHuaweiString;
	private String invoiceNo;
	
	public Invoice() {}
	
	public Invoice(List<Service> conceptos, Date fechaFactura, String numeroFactura, String cuenta, String ciclo,
			double importe, double iva, double total, String estatus, String transType, String importeLayoutHuawei, String invoiceNo, 
			String importeLayoutHuaweiString) {
		super();
		this.conceptos = conceptos;
		this.fechaFactura = fechaFactura;
		this.numeroFactura = numeroFactura;
		this.cuenta = cuenta;
		this.ciclo = ciclo;
		this.importe = importe;
		this.iva = iva;
		this.total = total;
		this.estatus = estatus;
		this.transType = transType;
		this.importeLayoutHuawei = importeLayoutHuawei;
		this.importeLayoutHuaweiString = importeLayoutHuaweiString;
		this.invoiceNo = invoiceNo;
	}
	public List<Service> getConceptos() {
		return conceptos;
	}
	public void setConceptos(List<Service> conceptos) {
		this.conceptos = conceptos;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
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
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getAccountKey() {
		return accountKey;
	}
	public void setAccountKey(String accountKey) {
		this.accountKey = accountKey;
	}
	public long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public double getOpenAmount() {
		return openAmount;
	}
	public void setOpenAmount(double openAmount) {
		this.openAmount = openAmount;
	}
	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getImporteLayoutHuawei() {
		return importeLayoutHuawei;
	}

	public void setImporteLayoutHuawei(String importeLayoutHuawei) {
		this.importeLayoutHuawei = importeLayoutHuawei;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getImporteLayoutHuaweiString() {
		return importeLayoutHuaweiString;
	}

	public void setImporteLayoutHuaweiString(String importeLayoutHuaweiString) {
		this.importeLayoutHuaweiString = importeLayoutHuaweiString;
	}

	@Override
	public String toString() {
		return "Invoice [conceptos=" + conceptos + ", fechaFactura=" + fechaFactura + ", numeroFactura=" + numeroFactura
				+ ", cuenta=" + cuenta + ", ciclo=" + ciclo + ", importe=" + importe + ", iva=" + iva + ", total="
				+ total + ", estatus=" + estatus + "]";
	}
	
}
