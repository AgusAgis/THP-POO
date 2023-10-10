package edu.ort.clase.dos;
import java.util.Scanner;
public class Multiplos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, acumulador = 0, limite=1000;
		System.out.println("Ingrese un número para obtener la suma de los múltiplos");
		num = Integer.parseInt(input.nextLine());
		for(int i = 1; i < limite; i++ ) {
			if( i % 3 == 0 || i % 5 == 0) {
				acumulador += i;		
			}
		}
		System.out.println(acumulador);
		input.close();
	}

}
