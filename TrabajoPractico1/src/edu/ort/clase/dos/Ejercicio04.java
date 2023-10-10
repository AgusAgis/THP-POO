package edu.ort.clase.dos;

import java.util.Scanner;

public class Ejercicio04 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// declaro variables
		
		int precioHora, cantidadHorasTrabajadasDiarias, salarioSemanal;
		final int SEMANA = 5;
		
		System.out.println("Ingrese el precio por hora de trabajo");
		precioHora = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la cantidad de horas trabajadas diariamente");
		cantidadHorasTrabajadasDiarias = Integer.parseInt(input.nextLine());
		
		salarioSemanal = (precioHora * cantidadHorasTrabajadasDiarias) * SEMANA + (cantidadHorasTrabajadasDiarias / 2)* precioHora;
		
		System.out.println("Salario semanal: " + salarioSemanal);	

	}

}
