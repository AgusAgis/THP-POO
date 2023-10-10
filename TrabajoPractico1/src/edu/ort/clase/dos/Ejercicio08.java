package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// declaro las variables a utilizar
		int num1,num2, resultadoSuma, resultadoResta, resultadoDivision, resultadoMultiplicacion;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo número");
		num2 = Integer.parseInt(input.nextLine());
		input.close();
		
		resultadoSuma = num1 + num2;
		System.out.println("El resultado de la suma es: "+resultadoSuma);
		resultadoResta = num1-num2;
		System.out.println("El resultado de la resta es: " + resultadoResta);
		resultadoMultiplicacion = num1*num2;
		System.out.println("El resultado de la multiplicación es: "+resultadoMultiplicacion);
		resultadoDivision = num1/num2;
		System.out.println("El resultado de la división es: " + resultadoDivision);
		

	}

}
