package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		int numero;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero");
		numero = Integer.parseInt(input.nextLine());
				
		for(int i = 1; i<=10; i++) {
			 int multiplo = numero * i;
	        System.out.println(numero + " * " + i + " = " + multiplo);
			
		}
		
		input.close();
			

	}

}
