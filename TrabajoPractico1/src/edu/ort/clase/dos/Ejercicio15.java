package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio15 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//Declaro varaibles
		final int EDAD_MINIMA = 6;
		final double ALTURA_MINIMA = 1.50;
		int edad;
		double altura;
		
	
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese su altura");
		altura = Double.parseDouble(input.nextLine());
		input.close();
		
		if(edad > EDAD_MINIMA || altura > ALTURA_MINIMA) {
			System.out.println("Ingresa a la montaña rusa");
		}else {
			System.out.println("Debe reunir al menos uno de los requisitos");
		}
	}

}
