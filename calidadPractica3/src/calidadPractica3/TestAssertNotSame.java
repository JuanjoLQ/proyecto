package calidadPractica3;

import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.Test;

public class TestAssertNotSame {

	Persona p = new Persona(2001, "Juan", "12345678A", 1.7f);
	Persona p0 = new Persona();

	@Test
	public void testAssertEquals () {
		System.out.println("Test assertNotSame");
		assertNotSame(p, p0);
	}

}
