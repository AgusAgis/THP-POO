package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, temp, mayor;
		System.out.println("Ingrese el primer número");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo número");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el tercer número");
		num3 = Integer.parseInt(input.nextLine());
		input.close();
		
		if(num1 > num2) {
			temp = num1;
		}else {
			temp = num2;
		}
		if(temp > num3) {
			mayor = temp;
		}else {
			mayor = num3;
		}
		
		System.out.println("El número mayor es: " + mayor);
	}

}
