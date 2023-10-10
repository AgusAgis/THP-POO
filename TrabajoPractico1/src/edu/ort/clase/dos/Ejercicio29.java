package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio29 {
	

	public static void main(String[] args) {
		
		final Scanner input = new Scanner(System.in);
		
		int nota;
					
		do {
			System.out.println("Ingrese una nota");
			nota = Integer.parseInt(input.nextLine());
		} while(nota < 0 || nota >10);
		
		System.out.println("Nota ingresada: " + nota);
		
		input.close();
		
	}

}
