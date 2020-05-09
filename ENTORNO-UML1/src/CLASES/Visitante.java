package CLASES;

public class Visitante {
	String nombre;
	String apellido;
	public Visitante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public boolean VisitaEstudiante() {
		System.out.println("quizas");
		return false;
	}
	
	public boolean familiarEstudiante() {
		System.out.println();
		return true;
	}
}
