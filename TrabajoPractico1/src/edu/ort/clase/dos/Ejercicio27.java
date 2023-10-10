package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio27 {

	public static void main(String[] args) {
		int edad, edadesImparesMayores18 = 0, sumaDeEdades = 0;
		double edadPromedio;
		final int EDADES_TOTALES = 5;
		final Scanner input = new Scanner(System.in);
		
		
		
		for( int i=1 ; i <= EDADES_TOTALES ; i ++) {
			
			System.out.println("Ingrese la edad "+i+": ");
			edad = Integer.parseInt(input.nextLine());
			
			if(edad %2 !=0 && edad>18 ) {
				edadesImparesMayores18++;
			} 
			sumaDeEdades += edad;
			
		}
		edadPromedio = sumaDeEdades/EDADES_TOTALES;
	
		System.out.println("La edad promedio es: "+ String.format("%.0f", edadPromedio));
		System.out.println("Edades impares mayores de 18: "+ edadesImparesMayores18 );
		input.close();
	}

}
