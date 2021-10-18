package Main;

import Entity.Usuario;
import Entity.UsuarioBuilder;

public class Main {

	public static void main(String[] args) {
		
		Usuario user = new UsuarioBuilder().build("example@gmail.com", "Pepe");
		
		System.out.print(user.toString());
	}
	
	
}
