package edu.ort.clase.dos;

public class Bisiesto {

	public static void main(String[] args) {
		int añoDeInicio = 1582, añoFin = 2010, contBiciesto = 0;
		for(int i = añoDeInicio; i <=añoFin; i++) {
			if( i % 4 == 0 && (i % 100 != 0) || i % 400 == 0  ) {
				contBiciesto++;
			}
		}
		System.out.println(contBiciesto);
	}

}
