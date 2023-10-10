package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		int n, contadorMultiplos = 1, i=1;
		final Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.println("Ingrese un número natural");
			n = Integer.parseInt(input.nextLine());
		} while(n <= 0);
		
		while(contadorMultiplos <= n) {
			if( (i*3)%5 != 0) {
				System.out.println("3 x " + i+ " = " + (3*i));
				contadorMultiplos++; //se incrementa solo cuando es multiplo de 3 
			}
			
			i++; //se incrementa cada vez que ingreso al ciclo while
		}
		
		input.close();

	}

}
