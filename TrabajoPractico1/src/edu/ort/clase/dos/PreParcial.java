package edu.ort.clase.dos;
import java.util.Scanner;
public class PreParcial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final char VERDE = 'V', ROJO = 'R',  FIN = 'F'; 
		final int FIN_VUELTAS = 5;
	    char auto;
	    int cantVueltasR = 0, cantVueltasV = 0;
	    int acumPianitosR = 0, acumPianitosV = 0;
	    int pianitos;
	    double promPianitosR = 0,  promPianitosV = 0;
		
	do {
		System.out.println("¿Qué auto pasó? (V/R/ F para terminar)");
		auto = Character.toUpperCase(input.nextLine().charAt(0));
	} while( auto != VERDE && auto != ROJO && auto != FIN);
	
	while( cantVueltasV < FIN_VUELTAS && cantVueltasR < FIN_VUELTAS && auto != FIN );
	do {
		System.out.println("¿Cuántas veces tocó el pianito?");
		pianitos = Integer.parseInt(input.nextLine());
	}while( pianitos < 0);
	
	if( auto == VERDE) {
		cantVueltasV++;
		acumPianitosV += pianitos;
	}else {
		cantVueltasR++;
		acumPianitosR +=pianitos;
	}
	do {
		System.out.println("¿Qué auto pasó? (V/R/ F para terminar)");
		auto = Character.toUpperCase(input.nextLine().charAt(0));
		input.close();
	} while( auto != VERDE && auto != ROJO && auto != FIN);
	
	if(auto != FIN) {
		if(cantVueltasR == 5) {
			System.out.println("Ganó el rojo");
		}else {
			System.out.println("Ganó el verde");
		}
	}  else{
			System.out.println("El ganador es indefinido");
		}
	
	if(cantVueltasV != 0) {
		promPianitosV = acumPianitosV/cantVueltasV;
	}else {
		System.out.println("El verde no dio vueltas");
	}
	if(cantVueltasR != 0) {
		promPianitosR = acumPianitosR/cantVueltasR;
	}else {
		System.out.println("El rojo no dio vueltas");
	}
		
	if(promPianitosV < promPianitosR && cantVueltasV !=0) {
		System.out.println("EL auto verde tuvo menor promedio de salidas de pista");
	}else {
		if(cantVueltasR !=0) {
			System.out.println("EL auto rojo tuvo un menor promedio de salidas de pista");
		}
	}
	
	}
}
