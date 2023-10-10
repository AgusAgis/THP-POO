package thp.tp0.holayo;

import java.util.Scanner;

public class HolaYo {

	public static void main(String[] args) {
		//Crear las variables
		String nombre; 
		int edad;
		Scanner input = new Scanner(System.in);
		//Pedir el nombre del usuario
		System.out.println("¿Cómo te llamas?");
		nombre = input.nextLine();
		//Saludar diciendo "Hola" + "nombre"
		System.out.println("Hola " + nombre + "!");
		//pido la edad
		System.out.println("¿Cuántos años tenes?");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("UUUUH!");
		input.close();

	}

}
