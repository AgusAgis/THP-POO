package edu.ort.clase.dos;
import java.util.Scanner;
public class Poda {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final char FINAL = 'F', SI = 'S', NO ='N', BLANCO = 'B';
		char opcion;
		int edad = 0;
		int votosSi = 0, votosNo=0, votosBlanco=0, acumEdad = 0, contVotos=0;
		
		
		do {
			do { 
				System.out.println("Ingrese una opción S/N/B/F");
				opcion = Character.toUpperCase(input.nextLine().charAt(0));
				
			}while(opcion != SI && opcion !=NO && opcion !=BLANCO && opcion!=FINAL);
			do {
				System.out.println("Edad del votante");
				edad = Integer.parseInt(input.nextLine());
			}while( edad < 18);
			
			if(opcion == SI) {
				votosSi++;
			}else if(opcion == NO) {
				votosNo++;
			}else {
				votosBlanco++;
			}
			acumEdad += edad;
			contVotos++;
						
		}while(opcion != FINAL);
		
		if(votosSi> votosNo && votosSi>votosBlanco) {
			System.out.println("La opción ganadora es si:" +votosSi);
		} else if(votosNo> votosSi && votosNo>votosBlanco) {
			System.out.println("La opción ganadora es no:" +votosNo);
		}else {
			System.out.println("Indeterminado");
		}
		System.out.println("El porcentaje de no es:"+ (votosNo * 100 /contVotos));
		System.out.println("Promedio edad de votantes es:" + (acumEdad/contVotos));
		input.close();
	}

}
