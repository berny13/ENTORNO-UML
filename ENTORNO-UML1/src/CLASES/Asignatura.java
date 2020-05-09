package CLASES;

public class Asignatura {
	String nombre;
	String curso;
	String temas;
	public Asignatura(String nombre, String curso, String temas) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.temas = temas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTemas() {
		return temas;
	}
	public void setTemas(String temas) {
		this.temas = temas;
	}
	
	public void Actual() {
		System.out.println("fol");
	}
	
	public void temarecibido() {
		System.out.println("derecho laborl");
	}
	
	
}
