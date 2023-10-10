package ar.edu.ort.ejercicioPersona;

public class Domicilio {

	private String calle;
	private int numero;
	private String ciudad;
	
	public Domicilio(String calle, String ciudad, int numero) {
		this.setCalle(calle);
		this.setCiudad(ciudad);
		this.setNumero(numero);
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCalle() {
		return this.calle;
	}
	public String getCiudad() {
		return this.ciudad;
	}
	public int getNumero() {
		return this.numero;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}
	
}
