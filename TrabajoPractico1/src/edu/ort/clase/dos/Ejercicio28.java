package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		int cantidad, numeroIngresado, posicionMay = 1,posicionMen = 1, numeroMayor = Integer.MIN_VALUE, numeroMenor = Integer.MAX_VALUE;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese cantidad de numeros a ingresar");
			cantidad = Integer.parseInt(input.nextLine());
		}while( cantidad < 1);
		
		for( int i = 1 ; i <= cantidad ; i++) {
			System.out.println("Ingrese un numero");
			numeroIngresado =  Integer.parseInt(input.nextLine());
			
			if(numeroIngresado > numeroMayor) {
				numeroMayor = numeroIngresado;
				posicionMay = i;
			}
			if(numeroIngresado < numeroMenor) {
				numeroMenor = numeroIngresado;
				posicionMen = i;
			}
			
		} 
		System.out.println("EL mayor número es " + numeroMayor + " ingresado en la " + posicionMay + " posicion ");
		System.out.println("EL mayor número es " + numeroMenor + " ingresado en la " + posicionMen + " posicion ");
		
		input.close();	

	}

}
