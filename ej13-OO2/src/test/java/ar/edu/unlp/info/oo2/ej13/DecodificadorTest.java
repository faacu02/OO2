package ar.edu.unlp.info.oo2.ej13;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DecodificadorTest {
	
	
	private Decodificador deco;
	private Pelicula thor, capitanAmerica, ironMan, dunkirk, rocky, rambo;
	
	@BeforeEach
	void setUp()throws Exception{
		this.thor = new Pelicula("Thor",2007, 7.9);
		this.capitanAmerica = new Pelicula("Capitan America", 2016,7.8);
		this.ironMan = new Pelicula("Iron man",2010, 7.9);
		this.dunkirk = new Pelicula("Dunkirk",2017, 7.9);
		this.rocky = new Pelicula("Rocky", 1976,8.1);
		this.rambo = new Pelicula("Rambo", 1979,7.8);
		
		this.thor.agregarSimilar(capitanAmerica);
		this.thor.agregarSimilar(ironMan);
		
		this.rambo.agregarSimilar(rocky);
		
		this.deco = new Decodificador();
		this.deco.agregarPeliAGrilla(capitanAmerica);
		this.deco.agregarPeliAGrilla(dunkirk);
		this.deco.agregarPeliAGrilla(ironMan);
		this.deco.agregarPeliAGrilla(rambo);
		this.deco.agregarPeliAGrilla(rocky);
		this.deco.agregarPeliAGrilla(thor);
		
		this.deco.agregarPeliAReproducida(rocky);
		this.deco.agregarPeliAReproducida(thor);
		
		
		
	}
	
	@Test
	void testObtenerRecomendadas() {
		this.deco.setCriterio(new Similaridad());
		assertTrue(this.deco.getRecomendadas().contains(capitanAmerica));
		assertTrue(this.deco.getRecomendadas().contains(ironMan));
		assertTrue(this.deco.getRecomendadas().contains(rambo));
		this.deco.setCriterio(new Puntaje());
		assertTrue(this.deco.getRecomendadas().contains(capitanAmerica));
		assertTrue(this.deco.getRecomendadas().contains(ironMan));
		assertTrue(this.deco.getRecomendadas().contains(dunkirk));
		
	}
	

}
