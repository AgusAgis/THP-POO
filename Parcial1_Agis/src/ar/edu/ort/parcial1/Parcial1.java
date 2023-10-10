package ar.edu.ort.parcial1;
import java.util.Scanner;
public class Parcial1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, numAnt = Integer.MIN_VALUE, meseta = 0, mesetaLarga = 0;
		final int MINIMO = 1, MAXIMO = 100, CORTE = 0;
		 boolean mesetaEncontrada = false; 
		 
		do { System.out.println("Ingrese un número entre 1 y 100");
			num = Integer.parseInt(input.nextLine());
			

		} while((num < MINIMO || num > MAXIMO) && num != CORTE);
		
		while(num != CORTE) {
			
			if(num > numAnt) {
				numAnt = num;
				mesetaEncontrada = false; 
			}else if(num == numAnt && !mesetaEncontrada) {
				meseta++;
				mesetaEncontrada = true;
								
			}
			if(meseta > mesetaLarga) {
				mesetaLarga = meseta;
			}
			
			do { System.out.println("Ingrese un número entre 1 y 100");
			num = Integer.parseInt(input.nextLine());
			
		 } while((num < MINIMO || num > MAXIMO) && num != CORTE);
							
	} 
		input.close();
			
		System.out.println("Hubieron estas cantidad de mesetas " + meseta++ );
		System.out.println("Meseta más larga fue " + mesetaLarga );
			
		
	}
}
