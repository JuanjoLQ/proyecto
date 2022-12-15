package calidadPractica3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestPartitionNif {
	
	Persona p = new Persona(2001, "Juan", "12345678A", 1.7f);
	
	//getNif, setNif, datosCompletos, toString, operativeUser
	
	@Test
	public void testPartitionNif() {
		
		//Check that two objects are equal
		System.out.println("Test assertEquals");
		assertEquals("12345678A", p.getNif());
		
		p.setNif("12345678B");
		
		System.out.println("Test assertEquals");
		assertEquals("12345678B", p.getNif());
		
		//Presuponemos que el objeto p ( Clase Persona ) ya esta creado con anterioridad)
		System.out.println("Test assertTrue");
		assertTrue(p.datosCompletos());
		
		System.out.println("Test assertNotNull");
		assertNotNull(p.datosCompletos());
		
		//Check that an object is not null
		System.out.println("Test assertNotNull");
		assertNotNull(p.toString());

		//Check that an object is true
		System.out.println("Test assertTrue");
		assertTrue(p.operativeUser());
		
	}

}
