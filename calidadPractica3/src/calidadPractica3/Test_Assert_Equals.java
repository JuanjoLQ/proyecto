package calidadPractica3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_Assert_Equals {
	Persona p = new Persona(2001, "Juan", "12345678A", 1.7f);
	
	@Test
	public void test_Assert_Equals() {
		System.out.println("Test assertEquals");
		assertEquals(true, p.operativeUser());
	}
}