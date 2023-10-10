package art.edu.ort.thp.ejercicio6;
// crea un obj de tipo dado, tirar el dado llamar al metodo tirar del obj dado (modifica tu valor) y
//y despues obtener promedio de 100 lanzamientos de los dados. Es el punto de origen del desarrollo
//punto de partida, crea obj, agrupa todas las clases a traves de las cuales llamo a los metodos para resolver el enunciado
//funcionalidad repartida entre clases
public class Test {

	public static void main(String[] args) {
		int resulDado1;
		int resulDado2;
		Dado dado1 = new Dado(); //tiene caras asignadas por default la cantidad de caras determinadas
		Dado dado2 = new Dado(12); //parametros que le paso 12 porque es el valor de params
		System.out.println("VALORES INICIALES");
		System.out.println(dado1.getValor());
		System.out.println(dado2.getValor());
		System.out.println("Tirando dado 1 ....");
		dado1.tirarDado();
		System.out.println("Tirando dado 2 ....");
		dado2.tirarDado();
		
		resulDado1 = dado1.getValor();
		resulDado2 = dado2.getValor();
		
		System.out.println("Primer tiro");
		System.out.println("Dado 1: "+ resulDado1);
		System.out.println("Dado 2: "+ resulDado2);
		
		verificarResultado(resulDado1, resulDado2);
		System.out.println("Promedio de lanzamientos ");
		System.out.println("Promedio de 100 lanzamientos: "+generarPromedio(100, dado1, dado2));

	}
	
	private static void verificarResultado(int n1, int n2) {
		
		System.out.println("Verificando resultado ...");
		if(n1 == n2) {
			System.out.println("Es el mismo número");
		}else if(n2 > n1) {
			System.out.println("El mayor número entre los dos es: " + n2);
		}else {
			System.out.println("El mayor número entre los dos es: " + n1);
		}
	}
	
	private static double generarPromedio(int cantTiros, Dado d1, Dado d2 ){
		double promedio = 0;
		
		if(cantTiros > 0) {
			promedio = acumularTiros( cantTiros, d1, d2) / (double)cantTiros;
		}
		return promedio;
		
	}
	//le paso el dado para acceder al metodo del dado tirarDado y getValor
	//le paso la referencia de memoria en donde está el dado
	private static int acumularTiros(int cantTiros, Dado d1, Dado d2) {
		int acumulador = 0;
		for( int i=0; i < cantTiros; i++) {
			
			d1.tirarDado();
			d2.tirarDado();
			acumulador += d1.getValor() + d2.getValor();
		}
		return acumulador;
	}

}
