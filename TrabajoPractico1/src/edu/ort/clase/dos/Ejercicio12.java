package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio12 {

	
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		int num1, num2 ;
		
		
		System.out.println("Ingrese un número entero");
		num1 = Integer.parseInt(input.nextLine()); 
		System.out.println("Ingrese otro número entero");
		num2 = Integer.parseInt(input.nextLine());
		input.close();
		
		if (num1 > num2) {
			System.out.println("El número mayor es el: " + num1);
		}else {
			System.out.println("El número mayor es el: " + num2);
		}

	}

}
