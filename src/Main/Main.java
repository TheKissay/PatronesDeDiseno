package Main;

import builder.Usuario;
import builder.UsuarioBuilder;
import singleton.Singleton;


public class Main {

	public static void main(String[] args) {
		
		Usuario user = new UsuarioBuilder().build("example@gmail.com", "Pepe");
		System.out.print(user.toString());
		
		
		
		for (int i = 0; i < 2; i++) {
			checkInstanceSingleton("MiInstancia");
		}

	}
	
	
	/**
	 * Comprueba si la instancia de singleton existe.
	 * @param pNombre nombre de la instancia.
	 */
	public static void checkInstanceSingleton(String pNombre) {
		if (Singleton.getInstance(pNombre) !=null) {
			System.out.println("\nCreado exitosamente."+pNombre);
		} else {
			System.out.println("\nError. No se puede crear"+" "+pNombre+" "+"porque ya existe");
		}
	}
	
	
}
