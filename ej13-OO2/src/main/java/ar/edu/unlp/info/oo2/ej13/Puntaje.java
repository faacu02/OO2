package ar.edu.unlp.info.oo2.ej13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Strategy{

	@Override
	public List<Pelicula> aplicarCriterio(Decodificador d) {
		// TODO Auto-generated method stub
		 return d.getGrilla().stream()
	                .sorted(Comparator.comparing(Pelicula::getPuntaje)
	                        .reversed()
	                        .thenComparing(Pelicula::getAño, Comparator.reverseOrder()))
	                .collect(Collectors.toList());
	}
	

}
