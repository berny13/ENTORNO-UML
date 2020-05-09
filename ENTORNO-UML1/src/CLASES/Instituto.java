package CLASES;

public class Instituto {
	
	String nombre;
	String director;
	int numeroSalon;
	public Instituto(String nombre, String director, int numeroSalon) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.numeroSalon = numeroSalon;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getNumeroSalon() {
		return numeroSalon;
	}
	public void setNumeroSalon(int numeroSalon) {
		this.numeroSalon = numeroSalon;
	}
	
	public void obtenerDirector() {
		System.out.println("Javier francisco");
	}
	
}
