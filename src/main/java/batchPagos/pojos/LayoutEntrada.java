package batchPagos.pojos;

public class LayoutEntrada {
	String Cuenta;
	String Region;
	String monto;
	String Comentario;
	
	public LayoutEntrada() {
		super();
	}
	
	
	public LayoutEntrada(String cuenta, String region, String monto, String comentario) {
		super();
		Cuenta = cuenta;
		Region = region;
		this.monto = monto;
		Comentario = comentario;
	}


	public String getCuenta() {
		return Cuenta;
	}
	public void setCuenta(String cuenta) {
		Cuenta = cuenta;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public String getComentario() {
		return Comentario;
	}
	public void setComentario(String comentario) {
		Comentario = comentario;
	} 
	
	

}
