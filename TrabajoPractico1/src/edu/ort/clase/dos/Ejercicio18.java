package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, mayor,menor;
		
		System.out.println("Ingrese un número entero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro número entero");
		num2 = Integer.parseInt(input.nextLine());
		input.close();
		
		if(num1 > num2) {
			mayor = num1;
		} else {
			mayor = num2;
		}
		
		if(num1 < num2) {
			menor = num1;
		} else {
			menor = num2;
		}
		
		if((mayor % menor) == 0) {
			 
			System.out.println("El mayor: " + mayor + " si es divisible por el menor " + menor + " porque da resto 0");
		}else {
			
		 System.out.println("El número mayor no es divisible por el menor");
		}
	}

}
