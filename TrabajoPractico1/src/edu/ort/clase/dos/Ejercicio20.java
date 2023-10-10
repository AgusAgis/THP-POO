package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,num2;
		String operacion;
		
		System.out.println("Ingrese un número entero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro número entero");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la operación a realizar");
		operacion = input.nextLine();
		input.close();
		
		switch(operacion) {
		case "suma", "+":
			System.out.println( num1 + num2);
		break;
		case "resta", "-":
			System.out.println( num1-num2);
		break;
		case "multiplicacion", "*":
			System.out.println(num1*num2);
		break;
		case "división", "/":
			System.out.println(num1/num2);
		}
		
		

	}

}
