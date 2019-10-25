package ejercicio;

public abstract class Arma {
	 
	protected String tipo;
	protected double daño;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getDaño() {
		return daño;
	}

	public void setDaño(double daño) {
		this.daño = daño;
	}
	
	public abstract void usar();


}
