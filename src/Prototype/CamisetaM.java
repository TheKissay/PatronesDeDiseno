package Prototype;

public class CamisetaM extends Camiseta{

	public CamisetaM(String pNombre, String pTalla, String pColor) {
		super(pNombre, pTalla, pColor);
		
	}
	
	
	
	@Override
	public CamisetaM clone() {
		return new CamisetaM(super.nombre, super.talla, super.color);
	}

	


}
