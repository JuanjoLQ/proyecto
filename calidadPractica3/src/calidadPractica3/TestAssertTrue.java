package calidadPractica3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TestAssertTrue {

Persona p = new Persona(2001, "Juan", "12345678A", 1.7f);
	
	@Test
	public void testAssertEquals () {
		System.out.println("Test assertTrue");
		assertTrue(p.datosCompletos());
	}

}
