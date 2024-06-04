package ar.edu.unlp.info.oo2.ej22_OO2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class SubwayTest {
	
	SubteWay director;
	ConstructorClasico constructorClasico;
	ConstructorVegetariano constructorVegetariano;
	ConstructorVegano constructorVegano;
	ConstructorSinTACC constructorSinTACC;
	
	@BeforeEach
	void setUp() throws Exception {
		director= new SubteWay();
	
		

	}
    @Test
    public void testCalcularCosto() {
    	constructorClasico= new ConstructorClasico();
    	director.setBuilder(constructorClasico);
    	director.hacerSanguche();
    	assertEquals(500, constructorClasico.getSanguche().calcularCosto());
    	constructorVegetariano= new ConstructorVegetariano();
    	director.setBuilder(constructorVegetariano);
    	director.hacerSanguche();
    	assertEquals(420, constructorVegetariano.getSanguche().calcularCosto());
    	constructorVegano= new ConstructorVegano();
    	director.setBuilder(constructorVegano);
    	director.hacerSanguche();;
    	assertEquals(620, constructorVegano.getSanguche().calcularCosto());
    	constructorSinTACC= new ConstructorSinTACC ();
    	director.setBuilder(constructorSinTACC);;
    	director.hacerSanguche();;
    	assertEquals(618, constructorSinTACC.getSanguche().calcularCosto() );
    }

}
