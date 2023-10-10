package edu.ort.clase.dos;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//Declaro variables constantes
		final int EDAD_MINIMA = 7;
		final double ALTURA_MINIMA = 1.50;
		int edad;
		double altura;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su altura");
		altura = Double.parseDouble(input.nextLine());
				
		input.close();
		
		//camino por le verdadero PMA//
		if(edad >= EDAD_MINIMA && altura > ALTURA_MINIMA) {
			System.out.println("Entra al juego");
		} else {
			System.out.println("Vuelva pronto");
		}
	}

}
