package edu.ort.clase.dos;
import java.util.Scanner;
public class PartidoTennis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int games1, games2;
		System.out.println("Ingrese games del jugador 1");
		games1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese games del jugador 2");
		games2 = Integer.parseInt(input.nextLine());
		input.close();
		
		if(games1 >= 6 && games1 - games2 >= 2) {
			System.out.println("El jugador 1 es el ganador");
		} else if(games2 == 6 && games2 - games1 >= 2) {
			System.out.println("El jugador 2 es el ganador");
		}	else if (games1 == 5 && games2 == 5) {
			System.out.println("Gana el primero que llegue a 7");
		}else if(games1 == 6 && games2 == 6)
			System.out.println("Gana el primero que llegue a 7");
	}

}
