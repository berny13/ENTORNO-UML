package CLASES;

public class Salones {
	int numerosalones;
	String tiposalon;
	String cursoclase;
	public Salones(int numerosalones, String tiposalon, String cursoclase) {
		super();
		this.numerosalones = numerosalones;
		this.tiposalon = tiposalon;
		this.cursoclase = cursoclase;
	}
	public int getNumerosalones() {
		return numerosalones;
	}
	public void setNumerosalones(int numerosalones) {
		this.numerosalones = numerosalones;
	}
	public String getTiposalon() {
		return tiposalon;
	}
	public void setTiposalon(String tiposalon) {
		this.tiposalon = tiposalon;
	}
	public String getCursoclase() {
		return cursoclase;
	}
	public void setCursoclase(String cursoclase) {
		this.cursoclase = cursoclase;
	}
	
	public void obtenernumeroSalones() {
		System.out.println(21);
	}
	
	public void indicarTipoSalon() {
		System.out.println("salon informatica");
	}
}
