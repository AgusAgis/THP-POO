package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un número entero");
		num = Integer.parseInt(input.nextLine());
		
		boolean esDeUnSoloDigito = num < 10 && num > -10;
		boolean esImpar = num % 2 == 1;
		boolean estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
		boolean noEstaEnAmbosGrupos = !esDeUnSoloDigito && !esImpar;
			
		input.close();
		
		System.out.println("El número cargado es: " + num);
		System.out.println("¿Es de un solo digito? " + esDeUnSoloDigito);
		System.out.println("¿Es de un solo digito y es impar? " + estaEnAmbosGrupos);
		System.out.println("¿No es de un solo digito ni impar? " + noEstaEnAmbosGrupos);
	

	}

}
