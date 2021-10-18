package Main;

import java.util.Scanner;

import CircuitBreaker.Instalador;
import CircuitBreaker.InstaladorStatus;
import Prototype.CamisetaM;
import builder.Usuario;
import builder.UsuarioBuilder;
import retry.Conexion;
import singleton.Singleton;


public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String passwordInput = "";
		Boolean login = false;
		
		
		
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
		
		
		/*Retry
		
		Conexion conexion = new Conexion("Login");
		
		
		while (conexion.getStatus() == true) {
			System.out.println("\n\n--------LOGIN-------");
			System.out.println("--------Introduzca la contraseña-------");
			passwordInput = reader.next();
			checkPassword(passwordInput, conexion, login);
		}
		
		*/
		
		//CircuitBreaker
		
		//Se crea un instalador con un máximo de 100 fallos.
		Instalador instalador1 = new Instalador(100.0);
		Double fails = 0.0;
		
		System.out.println("Instalando aplicación...");
		
		for (int i=0; i<2; i++) {
			fails += Math.random() * 100;
			
			
			System.out.println(fails);
		}
		
		if (fails >= instalador1.getNumFallosMax()) {
			instalador1.setcStatus(InstaladorStatus.CLOSED);
			
			System.out.println("Han ocurrido "+fails+" errores, no se ha instalado correctamente.");
		} else if (fails < instalador1.getNumFallosMax() && fails > 0.0) {
			instalador1.setcStatus(InstaladorStatus.HALF_OPEN);
			System.out.println("Han ocurrido "+fails+" errores, funcionará pero con posibles errores.");
		}else if (fails == 0.0) {
			instalador1.setcStatus(InstaladorStatus.OPEN);
			System.out.println("Han ocurrido "+fails+" errores, se ha instalado correctamente");
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
	
	
	/**
	 * Comprueba si la contraseña es la misma.
	 * @param pPassword Contraseña a comprobar
	 * @param conexion Conexión a usar.
	 * @param login Estado del login.
	 */
	public static void checkPassword(String pPassword, Conexion conexion, Boolean login) {
		if (conexion.getPassword().equals(pPassword)) {
			conexion.setStatus(false);
			System.out.println("Logueado correctamente.");
		} else {
			
			if (conexion.getIntentos() <=1) {
				System.out.println("Tu cuenta ha sido bloqueada por varios intentos fallidos.");
				conexion.setStatus(false);
			} else {
				conexion.setIntentos(conexion.getIntentos()-1);
				System.out.println("Contraseña incorrecta, te quedan: "+conexion.getIntentos());
			}
			
			
		}
	}
	
	
}
