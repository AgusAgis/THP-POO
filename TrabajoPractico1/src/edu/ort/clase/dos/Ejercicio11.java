package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int numeroEntero;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un número");
		numeroEntero = Integer.parseInt(input.nextLine());
		input.close();
	
		
		if(numeroEntero % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}

	}

}
