package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		int inscriptos, asientos;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese cantidad de inscriptos a la conferencia");
		inscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese cantidad de asientos disponibles");
		asientos = Integer.parseInt(input.nextLine());
		input.close();
		
		if(inscriptos <= asientos) {
			System.out.println("Alcanzan los asientos");
		}else {
			System.out.println("Necesitamos "+ (inscriptos-asientos) +" asientos");
		}
	}

}
