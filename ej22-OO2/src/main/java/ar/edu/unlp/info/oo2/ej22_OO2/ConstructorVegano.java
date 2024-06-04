package ar.edu.unlp.info.oo2.ej22_OO2;

public class ConstructorVegano extends Constructor {
	public ConstructorVegano() {
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	public void agregarAderezo() {
		 this.getSanguche().setAderezo(20);
		// TODO Auto-generated method stub
		
	}
	 @Override
	public void agregarAdicional() {
		// TODO Auto-generated method stu
		this.getSanguche().setAdicional(0);
		
	}
	 @Override
	public void agregarPan() {
		 this.getSanguche().setPan(100);
		// TODO Auto-generated method stub
		
	}
	 @Override
	public void agregarPrincipal() {
		 this.getSanguche().setPrincipal(500);
		// TODO Auto-generated method stub
		
	}
	

}
