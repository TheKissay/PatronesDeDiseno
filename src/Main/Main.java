package Main;

import Entity.UsuarioBuilder;

public class Main {

	public static void main(String[] args) {
		
		
		UsuarioBuilder usuarioBuilder= new UsuarioBuilder();
		
		usuarioBuilder.build("example@gmail.com", "Pepe");
	}
	
	
}
