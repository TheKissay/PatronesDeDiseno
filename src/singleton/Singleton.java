package singleton;

public class Singleton {
	private String nombre;
	private static Singleton singleton;
	
	
	
	private Singleton (String pNombre) {
		this.nombre = nombre;
	}

	
	
	public static Singleton getInstance(String pNombre) {
		if (singleton == null) {
			singleton = new Singleton(pNombre);
		} else {
			return null;
		}
		
		return singleton;
	}
	
	
	
	
}
