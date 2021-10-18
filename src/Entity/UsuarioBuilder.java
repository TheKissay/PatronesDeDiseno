package Entity;
import Entity.Usuario;


public class UsuarioBuilder {

	
	public Usuario build(String email, String nombre) {
		Usuario usuario = new Usuario(email, nombre);
		
		return usuario;
	}
}
