package ar.edu.ort.ejercicio1;
//test empieza y llama a Ej1 y ejecuta sumar, captura el valor de return y lo devuelvo a test.
public class Test1 {

	public static void main(String[] args) {
		
		//double resultado;
		//resultado = Ejercicio1.sumar(2,4);
		//System.out.println(resultado);
		
		double num1, num2;
		num1 = Ejercicio1.pedirNumero("Ingrese un número", 62, 134);
		System.out.println("Primer número "+ num1);
		num2 = Ejercicio1.pedirNumero("Ingrese otro número", 32, 200);
		System.out.println("Segundo número "+num2);
		
		
		Ejercicio1.closeScanner();
		System.out.println("Resultado:" + Ejercicio1.sumar(num1, num2));
	}
	
}
