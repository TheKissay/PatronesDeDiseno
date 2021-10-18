package Entity;

public class Usuario {
	private String email;
	private String nombre;
	
	Usuario(String pEmail, String pNombre) {
		this.email = pEmail;
		this.nombre = pNombre;
	}
	
	
	@Override
	public String toString() {
		return "Email:"+this.email+" "+"Nombre:"+this.nombre;
	}
}
