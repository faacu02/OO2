package ar.edu.unlp.info.oo2.ej22_OO2;

public abstract class Constructor {
	
	private Sanguche sanguchito;
	
	public Constructor() {
		// TODO Auto-generated constructor stub
	}
	
	public void crearSanguchito() {
		this.sanguchito = new Sanguche();
	}
	
	public abstract  void agregarPan();
	
	public abstract  void agregarAderezo();
	
	public abstract  void agregarPrincipal();
	
	public abstract  void agregarAdicional();
	
	public Sanguche getSanguche() {
		return this.sanguchito;
	}

}
