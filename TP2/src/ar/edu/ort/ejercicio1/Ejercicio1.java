package ar.edu.ort.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	static final Scanner input = new Scanner(System.in);
	public static double sumar(double num1, double num2) {
		
		/*double resultado;
		resultado = num1 + num2;
		return resultado;
		*/
		return num1 + num2;
	}
	
	public static double pedirNumero(String mensaje, int limMin, int limMax){
		
		final Scanner input = new Scanner(System.in);
		double numero = 0;
		
		do {
			System.out.println(mensaje);
			numero = Double.parseDouble(input.nextLine());
			
			if(numero <limMin || numero > limMax) {
				System.out.println("Numero invalido");
			}
			
		}while(numero <limMin || numero >limMax);
				
		return numero;
	}
	
	public static void closeScanner() {
		input.close();
	}
}
