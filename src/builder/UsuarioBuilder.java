package builder;
import builder.Usuario;


public class UsuarioBuilder {

	
	public Usuario build(String email, String nombre) {
		Usuario usuario = new Usuario(email, nombre);
		
		return usuario;
	}
}
