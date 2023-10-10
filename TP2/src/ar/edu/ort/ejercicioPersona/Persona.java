package ar.edu.ort.ejercicioPersona;

public class Persona {
	//todas las clases tiene un constructor por default
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	
	public Persona() {
	
		// constructor x default //
		this.nombre = " ";
		this.apellido = " ";
	}
	public Persona(String nombre, String apellido) {
// constructor con parametros sin encapsulamiento//
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
		
	}
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
		
	}
	public String obtenerNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
	public String obtenerNombre() {
		return this.nombre;
	}
	public String obtenerApellido() {
		return this.apellido;
	}
	public void mostrarDomicilio() {
		if(this.domicilio != null) {
			System.out.println(this.domicilio);
		}else {
			System.out.println(this.nombre + "No tiene domicilio asignado");
		}
	}
}
