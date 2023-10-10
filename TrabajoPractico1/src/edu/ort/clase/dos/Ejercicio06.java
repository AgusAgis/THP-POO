package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		//Declaro las variables
		final double SUELDO_FIJO = 44.000;
		double sueldoACobrar;
		double ventas;
		double porcentajeDeVentas;
		
		System.out.println("Ingrese el monto total de ventas realizadas");
		ventas = Double.parseDouble(input.nextLine());
		input.close();
		
		porcentajeDeVentas = (ventas/100)*16;
		sueldoACobrar = SUELDO_FIJO + porcentajeDeVentas;
		
		System.out.println("El empleado cobrará : " + String.format("%.3f", sueldoACobrar));		
		//System.out.println(String.format("%.3f",porcentajeDeVentas));	//formatea el valor para que se muestre con tres decimales
		

	}

}
