package ar.edu.unlp.info.oo2.ej22_OO2;

public class ConstructorVegetariano extends Constructor {
	
	public ConstructorVegetariano() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void agregarAderezo() {
		this.getSanguche().setAderezo(0);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarAdicional() {
		this.getSanguche().setAdicional(100);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarPan() {
		this.getSanguche().setPan(120);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarPrincipal() {
		this.getSanguche().setPrincipal(200);
		// TODO Auto-generated method stub
		
	}
	

}
