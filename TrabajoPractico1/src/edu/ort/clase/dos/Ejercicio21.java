package edu.ort.clase.dos;
import java.util.Scanner;
//Swith case evalua por igualdad de valor contra valor//
//variable no es booleano, no evalua verdadero o falso, sino un valor determinado.//
//Compara con las opciones que yo le doy sino sale por el default//
//Scanner por afuera del main static dentro del main final//

public class Ejercicio21 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final int DOM = 1, LUN = 2, MAR = 3, MIE = 4, JUE = 5, VIE = 6, SAB = 7;
		int numDia;
		System.out.println("Ingrese un número");		
		numDia = Integer.parseInt(input.nextLine());
		
		switch(numDia) {
		case DOM:
			System.out.println("DOMINGO");
			break;
		case LUN:
			System.out.println("LUNES");
			break;
		case MAR:
			System.out.println("MARTES");
			break;
			
		case MIE:
			System.out.println("MIERCOLES");
			break;
		case JUE:
			System.out.println("JUEVES");
			break;
		case VIE:
			System.out.println("VIERNES");
			break;
		case SAB:
			System.out.println("SABADO");
			break;
		default: 
		System.out.println("NO EXISTE ESE DÍA INGRESADO"); 
		input.close();
		}

	}

}
