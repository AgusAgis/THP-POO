// el método .equals() se usa para comparar cadenas de caracteres//
//equalsIgnoreCase este método te permite comparar independientemente de lowe or upper case
// un único caracter variable char
//por fuera static por dentro no//

package edu.ort.clase.dos;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int edad;
		char genero; 
		final char MAS = 'M'; 
		final char FEM = 'F'; //puedo usar constante porque es valor fijo F/M 
		final int EDAD_MAX = 120,  EDAD_MIN = 1, EDAD_JUB_MAS = 65, EDAD_JUB_FEM = 60;
		
		 System.out.println("Ingrese su edad");
		 edad = Integer.parseInt(input.nextLine()); 
		 
		
				 
		 //ir por el lado verdadero en el if//		 
		 if(edad >= EDAD_MIN && edad <= EDAD_MAX) {	
			 
			 System.out.println("Ingrese su género");
			 genero = Character.toUpperCase(input.nextLine().charAt(0));
			 //el input y el mensaje de salida van en bloque// 
			 
				 if( genero == MAS|| genero == FEM) {
					 
					 boolean femPuedeJubilarse = edad >=EDAD_JUB_FEM && genero== FEM;
					 boolean masPuedeJubilarse = edad >= EDAD_JUB_MAS && genero== MAS;
					 
					 if( femPuedeJubilarse || masPuedeJubilarse) {
						 
						 System.out.println("Está en edad de jubilarse");
					 }else {
						 System.out.println("No tiene la edad para jubilarse");
					 }
				 }else {
					 
					 System.out.println("El genero ingresado no es valido, solo puede ingresar F o  M");	 
				 }
			 
		 }else {
			 System.out.println("La edad ingresada esta fuera del rango permitido"); 
		 }
		 
		 System.out.println("Fin del programa"); 
		 input.close();

}
}
