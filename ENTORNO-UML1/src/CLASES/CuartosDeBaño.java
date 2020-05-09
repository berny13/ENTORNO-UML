package CLASES;

public class CuartosDeBaño {
	String Funciona;
	String sexo;
	String ubicacion;
	public CuartosDeBaño(String funciona, String sexo, String ubicacion) {
		super();
		Funciona = funciona;
		this.sexo = sexo;
		this.ubicacion = ubicacion;
	}
	public String getFunciona() {
		return Funciona;
	}
	public void setFunciona(String funciona) {
		Funciona = funciona;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void ObtenerFunciona() {
		System.out.println("si");
	}
	
	public void ObtenerSexo() {
		System.out.println("hombres");
	}
}
