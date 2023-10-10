package edu.ort.clase.dos;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int alto, ancho;
		System.out.println("Ingrese el alto ");
		alto = Integer.parseInt(input.nextLine());
						
		System.out.println("Ingrese el ancho");
		ancho = Integer.parseInt(input.nextLine());
		input.close();
		for(int i = 0; i < alto; i++) {
			for( int j = 0; j<ancho; j++) {
				System.out.println("+");				
			}
			System.out.println();
		}
		input.close();
	}

}
