package CLASES;

public class Aparcamiento {
	int numeroplazas;
	String hayplaza;
	String ubicacion;
	public Aparcamiento(int numeroplazas, String hayplaza, String ubicacion) {
		super();
		this.numeroplazas = numeroplazas;
		this.hayplaza = hayplaza;
		this.ubicacion = ubicacion;
	}
	public int getNumeroplazas() {
		return numeroplazas;
	}
	public void setNumeroplazas(int numeroplazas) {
		this.numeroplazas = numeroplazas;
	}
	public String getHayplaza() {
		return hayplaza;
	}
	public void setHayplaza(String hayplaza) {
		this.hayplaza = hayplaza;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void HayPlaza() {
		System.out.println("no");
	}
	public void numeroPlazas() {
		System.out.println("1");
	}
}
