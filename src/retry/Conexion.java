package retry;

public class Conexion {

	private String nombre;
	private Boolean status;
	private String password;
	public Integer intentos;
	
	
	public Conexion(String pNombre) {
		this.nombre = pNombre;
		this.status = true;
		this.intentos = 3;
		this.password = "abc";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public Integer getIntentos() {
		return intentos;
	}


	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
