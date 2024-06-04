package ar.edu.unlp.info.oo2.ej22_OO2;

public class SubteWay {
	
	private Constructor builder;
	
	public SubteWay() {
		// TODO Auto-generated constructor stub
	}
	
	public void setBuilder(Constructor builder) {
		this.builder = builder;
	}
	
	public void hacerSanguche() {
		this.builder.crearSanguchito();
		this.builder.agregarAderezo();
		this.builder.agregarAdicional();
		this.builder.agregarPan();
		this.builder.agregarPrincipal();
	}
	

}
