package edu.ort.clase.dos;
import java.util.Scanner;
public class EjercicicoVocalConsonante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		char letra;
		final char FIN = '*';
		boolean esVocal = false;
		boolean ultimoIngresoVocal = false;
    	int contPasaje = 0;
    	
		do {
			System.out.println("Ingrese una letra o * para terminar");
			letra = Character.toUpperCase(input.nextLine().charAt(0));
			
			if(letra == 'A' || letra =='E' || letra =='I' || letra =='O' || letra=='U') {
				ultimoIngresoVocal = true;
				
			}else {				
				if(ultimoIngresoVocal == true) {
					contPasaje++;
				ultimoIngresoVocal = false;
				}
			}	
			
		} while( letra != FIN);
		System.out.println("Los cantidad de cambios de vocal a consonante fue de: "+ contPasaje);
		input.close(); 
		/*
    	System.out.println("Ingrese una letra o * para terminar");
		letra = Character.toUpperCase(input.nextLine().charAt(0));
		while( letra != FIN) {
			esVocal = letra == 'A'|| letra =='E'|| letra =='I'|| letra =='O' || letra=='U';
			
			if(esVocal) {
				ultimoIngresoVocal = true;
			}else if(ultimoIngresoVocal) {
				contPasaje++;
				ultimoIngresoVocal = false;
			}
			System.out.println("Ingrese una letra o * para terminar");
			letra = Character.toUpperCase(input.nextLine().charAt(0));
		}   	
    	
		System.out.println("Los cantidad de cambios de vocal a consonante fue de: "+ contPasaje);
		input.close(); */
	}

}
