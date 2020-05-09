package CLASES;

import javax.swing.JOptionPane;

public class Profesor {
	String alumnos;

	public Profesor(String alumnos) {
		super();
		this.alumnos = alumnos;
	}

	public String getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String alumnos) {
		this.alumnos = alumnos;
	}
	
	public void aprobar() {
		int nota = 0;
		if (nota >= 5) {
			
		} else {
			JOptionPane.showInternalMessageDialog(null, "si aprobo");
		}
	}
	
	public void reprobar() {
		int nota = 0;
		if (nota < 5) {
			
		} else {
			JOptionPane.showInternalMessageDialog(null, "no aprobo");
		}
	}
}
