package CLASES;

public class Trabajadores {
	int nomina;
	int horaslaboradas;
	public Trabajadores(int nomina, int horaslaboradas) {
		super();
		this.nomina = nomina;
		this.horaslaboradas = horaslaboradas;
	}
	public int getNomina() {
		return nomina;
	}
	public void setNomina(int nomina) {
		this.nomina = nomina;
	}
	public int getHoraslaboradas() {
		return horaslaboradas;
	}
	public void setHoraslaboradas(int horaslaboradas) {
		this.horaslaboradas = horaslaboradas;
	}
	
	public void salarioMensual() {
		System.out.println("200 euros");
	}
	public void despedir() {
		
	}
}
