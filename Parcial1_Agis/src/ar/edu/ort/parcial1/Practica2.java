package ar.edu.ort.parcial1;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
	        int num, numAnt = -1, mesetaActual = 0, maxMeseta = 0, maxMesetaNum = -1, mesetasDetectadas = 0;
	        while (true) {
	            System.out.println("Ingrese un número entre 0 y 100 (0 para salir):");
	            num = Integer.parseInt(input.nextLine());
	            
	            if (num == 0) {
	                break;
	            }
	            
	            if (num < 0 || num > 100) {
	                System.out.println("Número fuera de rango. Intente nuevamente.");
	                continue;
	            }
	            
	            if (num == numAnt) {
	                mesetaActual++;
	            } else {
	                if (mesetaActual > 0) {
	                    mesetasDetectadas++;
	                    if (mesetaActual > maxMeseta) {
	                        maxMeseta = mesetaActual;
	                        maxMesetaNum = numAnt;
	                    }
	                }
	                mesetaActual = 1;
	            }
	            
	            numAnt = num;
	        }
	        
	        System.out.println("Mesetas detectadas: " + mesetasDetectadas);
	        if (mesetasDetectadas > 0) {
	            System.out.println("La meseta más larga fue de " + maxMeseta + " números iguales, con el número " + maxMesetaNum);
	        }

	}

}
