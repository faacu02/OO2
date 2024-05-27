package ar.edu.unlp.info.oo2.ej13;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Strategy {
	
	@Override
	public List<Pelicula> aplicarCriterio(Decodificador d) {
		// TODO Auto-generated method stub
		return d.getGrilla().stream()
                .sorted((p1, p2) -> Integer.compare(p2.getAño(), p1.getAño()))
                .collect(Collectors.toList());
    
	}
	

}
