package edu.ort.clase.dos;
import java.util.Scanner;
public class Ejercicio30 {

	public static void main(String[] args) {
		char operacion;
		final char SUMA = '+', RESTA = '-', DIVISION = '/', MULTIPLICACION ='*', FIN ='F';
		final Scanner input = new Scanner(System.in);
		do {
			System.out.println("Ingrese operación a realizar(+, - , * , /) o F para terminar)");
			operacion = Character.toUpperCase(input.nextLine().charAt(0));
		}while(operacion != SUMA && operacion != RESTA && operacion != MULTIPLICACION 
				&& operacion !=DIVISION && operacion != FIN  ); 
		// USO && para que salgo de la condicion sino vuelve a entrar funcione la validacion 
		// si me da F me vuelve a pedir el dato SINO de usar OR una es verdadero TODO es verdadero
		
		while(operacion != FIN) {
			int num1, num2;
			System.out.println("Ingrese numero");
			num1 = Integer.parseInt(input.nextLine());	
			System.out.println("Ingrese numero");
			num2 = Integer.parseInt(input.nextLine());
				
			
			switch(operacion) {
			case  SUMA:
				System.out.println( num1 + "+" + num2 + " = " + (num1+num2));
			break;
			case RESTA:
				System.out.println( num1 + "-" + num2 + " = " + (num1-num2));
			break;
			case  MULTIPLICACION:
				System.out.println( num1 + "*" + num2 + " = " + (num1*num2));
			break;
			case  DIVISION:
				if(num2 ==0) {
					System.out.println("No se puede dividir por 0");
				}else {
					
					System.out.println( num1 + "/" + num2 + " = " + (num1/num2));
				}
				break;
			}
			do {
				System.out.println("Ingrese operación a realizar(+, - , *, /) o F para terminar)");
				operacion = Character.toUpperCase(input.nextLine().charAt(0));
			}while(operacion != SUMA && operacion != RESTA && operacion != MULTIPLICACION 
					&& operacion !=DIVISION && operacion != FIN  ); 
				}
		input.close();
			
		}
				
		


}
