package edu.ort.clase.dos;
import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		int edad;
		double peso, altura, IMC;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese su peso");
		peso = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese su altura");
		altura = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());
		 IMC = peso / (altura*altura); 	
		input.close();
		
		if(edad < 45 && IMC <22) {
			System.out.println("El riesgo es bajo");
		}else if(edad < 45 && IMC >= 22) {
			System.out.println("El riesgo es medio");
		}else if(edad >= 45 && IMC < 22) {
			System.out.println("El riesgo es bajo");
		}else if(edad >= 45 && IMC <= 22) {
			System.out.println("El riesgo es medio");
		}
	}

}
