package calidadPractica3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestAssertEquals {
	Persona p = new Persona(2001, "Juan", "12345678A", 1.7f);
	
	@Test
	public void testAssertEquals () {
		System.out.println("Test assertEquals");
		assertEquals(true, p.datosCompletos());
	}
}