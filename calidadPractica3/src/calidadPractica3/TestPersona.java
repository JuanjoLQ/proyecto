package calidadPractica3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class TestPersona {

	Persona p = new Persona();
	@Test
	@BeforeClass
	public void beforeClass() {
		System.out.println("Uso de @BeforeClass, se muestra antes de los test de la clase a ejecutar..");
	}
	@Test
	@Before
	public void before() {
		System.out.println("Uso de @Before, se ejecuta justamente antes de iniciar el test a ejecutar.");
	}
	@Test
	@AfterClass
	public void afterClass() {
		System.out.println("Uso de @AfterClass, se ejecuta justamente después del test a ejecutar.");
	}
	@Test
	@After
	public void after() {
		System.out.println("Uso de @After, se ejecuta al final.");
	}
	@Test
	@Ignore
	public void ignore() {
		System.out.println("Uso de @Ignore, esta parte de código se ignora a la hora de ejecutar el test.");
	}
}
