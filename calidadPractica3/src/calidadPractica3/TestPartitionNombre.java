package calidadPractica3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestPartitionNombre {
	
	Persona p = new Persona(2001, "Juan", "12345678A", 1.7f);
	
	//getNombre, cambiaNombre, datosCompletos, toString, operativeUser
	
	@Test
	public void testPartitionNombre () {
		
		//Check that two objects are equal
		System.out.println("Test assertEquals");
		assertEquals("Juan", p.getNombre());
		
		p.cambiaNombre("Jose");
		
		System.out.println("Test assertEquals");
		assertEquals("Jose", p.getNombre());
		
		System.out.println("Test assertNotNull");
		assertNotNull(p.datosCompletos());
		
		//Presuponemos que el objeto p ( Clase Persona ) ya esta creado con anterioridad)
		System.out.println("Test assertTrue");
		assertTrue(p.datosCompletos());
		
		//Check that an object is not null
		System.out.println("Test assertNotNull");
		assertNotNull(p.toString());

		//Check that an object is true
		System.out.println("Test assertTrue");
		assertTrue(p.operativeUser());
		
	}

}
