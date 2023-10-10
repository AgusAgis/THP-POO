package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio05 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaro variables
		int num1, num2, aux;
		System.out.println("Ingrese un número entero : ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro número entero");
		num2 = Integer.parseInt(input.nextLine());
		
		
		System.out.println("Valores iniciales| num1: "+ num1 + "| num2: " + num2 );
		
		aux = num2;
		num2 = num1;
		num1 = aux;
		
		System.out.println("Valor intercambiado | num2: " + num2 + "| num1: " + num1);

	}

}
