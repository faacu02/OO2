package ar.edu.unlp.info.oo2.ej13;
import java.util.*;
import java.util.stream.Collectors;
public abstract class Strategy {
	
	public List<Pelicula>obtenerRecomendadas(Decodificador d){
		return this.aplicarCriterio(d).stream().filter(peli->d.noFueVista(peli)).limit(3).collect(Collectors.toList());
		
	}
	
	public abstract List<Pelicula>aplicarCriterio(Decodificador d);

}
