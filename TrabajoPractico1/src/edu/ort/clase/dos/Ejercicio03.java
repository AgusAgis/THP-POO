package edu.ort.clase.dos;
import java.util.Scanner; 

public class Ejercicio03 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaro las variables
		int numeroIngresado;
		double numeroMultiplicado;
		double numeroDividido;
		
		System.out.println("Ingrese un número");
		numeroIngresado = Integer.parseInt(input.nextLine());
		
		numeroMultiplicado = (numeroIngresado * 5);
		numeroDividido = (numeroIngresado / 2);
		
		System.out.println("El número multiplicado es: " + numeroMultiplicado);
		System.out.println("El número dividido es: " + numeroDividido);

	}

}
