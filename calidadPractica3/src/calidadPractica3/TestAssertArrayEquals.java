package calidadPractica3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class TestAssertArrayEquals {
    Persona [] persona = new Persona[2];
    Persona [] persona1 = new Persona[3];

    @Test
    public void testAssertEquals () {
        System.out.println("Test assertArrayEquals");
        assertArrayEquals(persona1,persona);
    }
}
