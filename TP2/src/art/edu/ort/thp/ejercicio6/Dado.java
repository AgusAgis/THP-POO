package art.edu.ort.thp.ejercicio6;

public class Dado {
	private static final int CANT_CARAS_DEFAULT = 6;
	private int cantCaras;
	private int valor;
	//constructor sin params
	public Dado() {
		this.cantCaras = CANT_CARAS_DEFAULT;
		this.valor = (int)((Math.random() * CANT_CARAS_DEFAULT) + 1 );
	}
	//constructor parametrizado
	public Dado (int cantCaras) {
		this.cantCaras = cantCaras;
		this.valor = (int)((Math.random() * cantCaras) + 1 );
	}
	public int getValor() {
		return this.valor;
	}
	public void tirarDado() {
		this.valor = (int)((Math.random() * this.cantCaras) + 1 );
	}
}
