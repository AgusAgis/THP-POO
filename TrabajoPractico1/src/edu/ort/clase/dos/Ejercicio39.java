package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		double distancia;
		int cantidadDeJugadores, tirosAlCentro = 0, puntosAux = 0;;
		String nombre, nombreAux = null;
				
		
		do {
			System.out.println("¿Cuántos jugadores son?");
			cantidadDeJugadores = Integer.parseInt(input.nextLine());
			for(int jugadores = 0; jugadores<cantidadDeJugadores; jugadores++) {
				int puntos = 0;
				System.out.println("Ingrese su nombre");
				nombre = input.nextLine();
				
				for(int tiros = 1; tiros <=3; tiros++) {
					System.out.println(nombre + ": tiro n° "+tiros);
					do {
						System.out.println("Ingrese distancia del tiro");
						distancia = Double.parseDouble(input.nextLine());
						
					}while(distancia < 0);
					
					if(distancia == 0) {
						puntos += 500;
						tirosAlCentro +=1;
					}else if(distancia <=10){
						puntos+=250;
					}else if(distancia >11 && distancia <=50) {
						puntos+=100;
					}else {
						System.out.println("Ha caído fuera del tablero");
					}
				}
				if(puntos>puntosAux) {
					puntosAux = puntos;
					nombreAux= nombre;
				}
				System.out.println(nombre + " tiene " + puntos + " puntos");
			
		}
			
		}while(cantidadDeJugadores<2);
	
			
		System.out.println("El ganador es: "+ nombreAux + " con "+ puntosAux);
		System.out.println("Cantidad de tiros al centro: "+ tirosAlCentro);
		input.close();
	}

}
