package edu.ort.clase.dos;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, resultado = 1, factorial = 1;
		System.out.println("Ingrese un número");
		num = Integer.parseInt(input.nextLine());
		
		for(int i = 1; i <= num; i++) {
			resultado = i * resultado;
			factorial = resultado;
			
		}
		System.out.println("El factorial de " + num + " es " + factorial);
		input.close();
	}

}
