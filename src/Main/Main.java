package Main;

import Prototype.CamisetaM;
import builder.Usuario;
import builder.UsuarioBuilder;
import singleton.Singleton;


public class Main {

	public static void main(String[] args) {
		
		//Builder
		Usuario user = new UsuarioBuilder().build("example@gmail.com", "Pepe");
		System.out.print(user.toString());
		
		
		//Singleton
		for (int i = 0; i < 2; i++) {
			checkInstanceSingleton("MiInstancia");
		}
		
		
		//Prototype
		CamisetaM camiseta = new CamisetaM("Camiseta larga", "M", "Amarillo");
		CamisetaM camiseta2 = camiseta.clone();
		CamisetaM camiseta3 = camiseta.clone();
		CamisetaM camiseta4 = camiseta.clone();
		CamisetaM camiseta5 = camiseta.clone();

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
