package ar.edu.unlp.info.oo2.ej13;
import java.util.*;
public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private Strategy criterio;
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		// TODO Auto-generated constructor stub
	}
	
	public void setCriterio(Strategy criterio) {
		this.criterio = criterio;
	}

	
	public void agregarPeliAGrilla(Pelicula peli) {
		this.grilla.add(peli);
	}
	
	public void agregarPeliAReproducida(Pelicula peli) {
		if (this.grilla.contains(peli))
			this.reproducidas.add(peli);
	}
	
	public boolean noFueVista(Pelicula peli) {
		return !this.reproducidas.contains(peli);
	}
	
	public List<Pelicula> getGrilla() {
		return grilla;
	}
	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}
	
	public List<Pelicula>getRecomendadas(){
		return criterio.obtenerRecomendadas(this);
	}
	
	
	
	

}
