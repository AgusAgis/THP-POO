package ar.edu.ort.ejercicioPersona;

public class Test {

	public static void main(String[] args) {
		Domicilio ort = new Domicilio("Yatay", "Almagro", 240);
		
		Persona fulano = new Persona();
		Persona mengana = new Persona("Mengana", "Gomez");
		System.out.println("Desde el constructor " + mengana.obtenerNombreCompleto());
		
		fulano.ponerNombre("Agustin");
		fulano.ponerApellido( "Agis");
		System.out.println(fulano.obtenerNombreCompleto());
		
		
		mengana.ponerNombre("Juana");
		mengana.ponerApellido("Dominguez");
		System.out.println(mengana.obtenerNombreCompleto());
		mengana.mostrarDomicilio();
		System.out.println("Domicilio-fulano: ");
	}

}