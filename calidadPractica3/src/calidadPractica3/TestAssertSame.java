package calidadPractica3;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Test;

public class TestAssertSame {

	Persona p = new Persona(2001, "Juan", "12345678A", 1.7f);
	Persona p0 = new Persona();

	@Test
	public void testAssertEquals () {
		System.out.println("Test assertSame");
		assertSame(p, p0);
	}

}
