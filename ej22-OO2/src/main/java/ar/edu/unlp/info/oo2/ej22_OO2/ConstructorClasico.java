package ar.edu.unlp.info.oo2.ej22_OO2;

public class ConstructorClasico extends Constructor {
	
	public ConstructorClasico() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void agregarAderezo() {
		this.getSanguche().setAderezo(20);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarAdicional() {
		this.getSanguche().setAdicional(80);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarPan() {
		this.getSanguche().setPan(100);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarPrincipal() {
		this.getSanguche().setPrincipal(300);
		// TODO Auto-generated method stub
		
	}
	

}
