package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		double angulo1, angulo2, angulo3;
		final double SUMA_TOTAL_DE_ANGULOS = 180;
		
		System.out.println("Ingrese el primer àngulo");
		angulo1 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el segundo àngulo");
		angulo2 = Double.parseDouble(input.nextLine());
		input.close();
		
		angulo3 = SUMA_TOTAL_DE_ANGULOS - (angulo1 + angulo2);
			
		
		System.out.println("El valor del àngulo faltante es: "+ angulo3);	
		
	}
	

}
