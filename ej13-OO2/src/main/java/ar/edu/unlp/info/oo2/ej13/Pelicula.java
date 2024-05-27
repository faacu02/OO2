package ar.edu.unlp.info.oo2.ej13;
import java.util.*;
public class Pelicula {
		private String titulo;
		private int año;
		private List<Pelicula> similares;
		private double puntaje;
		
		
		public Pelicula(String titulo, int año, double puntaje) {
			this.año = año;
			this.puntaje = puntaje;
			this.titulo = titulo;
			this.similares = new ArrayList<Pelicula>();
			// TODO Auto-generated constructor stub
		}
		
		
		public void agregarSimilar(Pelicula peli) {
			if(!this.similares.contains(peli)){
				this.similares.add(peli);
				peli.agregarSimilar(this);
			}
		}
		
		
		public List<Pelicula> getSimilares() {
			return similares;
		}
		public int getAño() {
			return año;
		}
		public double getPuntaje() {
			return puntaje;
		}
		

}
