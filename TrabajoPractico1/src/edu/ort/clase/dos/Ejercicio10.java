package edu.ort.clase.dos;
import java.util.Scanner;
		

public class Ejercicio10 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		String socio1, socio2, socio3;
		double ingreso1, ingreso2, ingreso3, porcentaje1,porcentaje2, porcentaje3, capitalTotal;
		
		System.out.println("Indique el nombre del socio");
		socio1 = input.nextLine();
		System.out.println("Indique cantidad de capital invertido por dicho socio");
		ingreso1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Indique el nombre del socio");
		socio2 = input.nextLine();
		System.out.println("Indique cantidad de capital invertido por dicho socio");
		ingreso2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Indique el nombre del socio");
		socio3 = input.nextLine();
		System.out.println("Indique cantidad de capital invertido por dicho socio");
		ingreso3 = Double.parseDouble(input.nextLine());
		
		
		capitalTotal = ingreso1+ingreso2+ingreso3;
		
		porcentaje1 = (ingreso1*100)/capitalTotal;
		porcentaje2 = (ingreso2*100)/capitalTotal;
		porcentaje3 = (ingreso3*100)/capitalTotal;
		

		System.out.println(socio1 + " aportò el "+ String.format("%.2f", porcentaje1 ) + " %");
		System.out.println(socio2 + " aportò el "+ String.format("%.2f", porcentaje2) + " %");
		System.out.println(socio3 + " aportò el "+ String.format("%.2f", porcentaje3) + " %");
input.close();
	}

}
