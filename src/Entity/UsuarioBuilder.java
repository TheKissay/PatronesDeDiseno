package Entity;
import Entity.Usuario;


public class UsuarioBuilder {

	
	public void build(String email, String nombre) {
		Usuario usuario = new Usuario(email, nombre);
	}
}
