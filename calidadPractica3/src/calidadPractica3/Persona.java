package calidadPractica3;

public class Persona {
	
	private int anioNacimiento = 0;
	private String nombre;
	private String nif;
	private float altura = 0;
	
	
	public Persona(int anioNacimiento, String nombre, String nif, Float altura){
		this.anioNacimiento = anioNacimiento;
		this.nombre = nombre;
		this.nif = nif;
		this.altura = altura;
	}
	
	public Persona(){
		anioNacimiento = 1994;
		altura = 1.70f;
	}
	
	public Persona(Persona p2){
		anioNacimiento = p2.anioNacimiento;
		nombre = p2.nombre;
		nif = p2.nif;
		altura = p2.altura;
	}

	
	public String getNombre() {
		return nombre;
	}

	public String getNif() {
		return nif;
	}

	public float getAltura() {
		return altura;
	}
	
	public void setNif(String nif){
		this.nif = nif;
	}

	public int calculaEdad(int anioActual){
		return (anioActual - anioNacimiento);
	}
	
	public void cambiaNombre(String nuevoNombre){
		nombre = nuevoNombre;
	}
	
	public boolean datosCompletos(){
		if(anioNacimiento != 0 && nombre != null && nif != null && altura != 0) {
			System.out.println("Correcto: Todos los campos estan rellenos.");
			return true;
		}
		else {
			System.out.println("Error: NO todos los campos estan rellenos.");
			return false;
		}
	}
	
	public String toString(){
		return "Año nacimiento: " + this.anioNacimiento +
				", Nombre: " + this.nombre + ", NIF: " + this.nif + ", Altura: " + this.altura;
	}
	
	public boolean operativeUser() {
		if(this.datosCompletos() && this.toString() != null) {
			System.out.println("Exito: usuario operativo");
			return true;
		}
		else {
			System.out.println("Error: usuario NO operativo");
			return false;
		}
		
		
	}
	
	
	
	
	
}