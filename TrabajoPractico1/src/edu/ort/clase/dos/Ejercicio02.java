package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio02 {
	
	static Scanner input = new Scanner(System.in); // Scanner da lugar a recibir o capturar datos que se ingresa por teclado o consola//

	public static void main(String[] args) {
		//Crear las variables
		final int CANT_NOTAS = 3;
		double nota1, nota2, nota3;
		double notaPromedio;
	
		System.out.println("Ingrese la nota del primer trimestre: ");
		nota1 = Double.parseDouble(input.nextLine()); //nextLine captura la linea completa sacando el enter y espacio basura del input en el sistema en el buffer, conflicto sino esperando ser procesado y suma los strings //
		//Integer.parseInt(input.nextLine())
		
		
		System.out.println("Ingrese la nota del segundo trimestre: ");
		nota2 = Double.parseDouble(input.nextLine());
		
		
		System.out.println("Ingrese la nota del tercer trimestre: ");
		nota3 = Double.parseDouble(input.nextLine());
		
		notaPromedio = (nota1+nota2+nota3) / CANT_NOTAS;
		System.out.println("La nota promedio es: " + notaPromedio);
		input.close(); 

	}

}
