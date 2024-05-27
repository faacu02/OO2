package ar.edu.unlp.info.oo2.ej13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Strategy {
	
	@Override
	public List<Pelicula> aplicarCriterio(Decodificador d) {
		// TODO Auto-generated method stub
		List<Pelicula> similares = d.getReproducidas().stream()
                .flatMap(peli -> peli.getSimilares().stream())
                .distinct()  // Elimina duplicados
                .collect(Collectors.toList());
        
        // Ordenar por año de estreno descendente
        return similares.stream()
                .sorted(Comparator.comparing(Pelicula::getAño).reversed())
                .collect(Collectors.toList());
	}
	
	
	

}
