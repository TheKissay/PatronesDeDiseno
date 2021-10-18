package CircuitBreaker;

public class Instalador {
	
	private Double numFallos;
	private Double numFallosMax;
	private boolean status; 
	private InstaladorStatus cStatus;
	private InstaladorStatusSpecial cStatusSpecial;
	
	public Instalador(Double pNumFallosMax) {
		this.numFallos = 0.0;
		this.numFallosMax = pNumFallosMax;
		this.status = true;
	}
	
	
	public Double getNumFallos() {
		return numFallos;
	}
	
	public void setNumFallos(Double numFallos) {
		this.numFallos = numFallos;
	}
	
	public InstaladorStatus getcStatus() {
		return cStatus;
	}
	
	public void setcStatus(InstaladorStatus cStatus) {
		this.cStatus = cStatus;
	}
	
	public InstaladorStatusSpecial getcStatusSpecial() {
		return cStatusSpecial;
	}
	
	public void setcStatusSpecial(InstaladorStatusSpecial cStatusSpecial) {
		this.cStatusSpecial = cStatusSpecial;
	}


	public Double getNumFallosMax() {
		return numFallosMax;
	}


	public void setNumFallosMax(Double numFallosMax) {
		this.numFallosMax = numFallosMax;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
