package ar.edu.unlp.info.oo2.ej22_OO2;

public class Sanguche {
	
	private int pan;
	private int principal;
	private int aderezo;
	private int adicional;
	
	public Sanguche() {
		// TODO Auto-generated constructor stub
	}
	
	public void setAderezo(int aderezo) {
		this.aderezo = aderezo;
	}
	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}
	
	 
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	
	public void setPan(int pan) {
		this.pan = pan;
	}
	
	public int calcularCosto() {
		return this.aderezo + this.pan + this.adicional + this.principal;
	}

}
