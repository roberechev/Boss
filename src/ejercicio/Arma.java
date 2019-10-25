package ejercicio;

public abstract class Arma {
	 
	protected String tipo;
	protected double dano;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double daño) {
		this.dano = daño;
	}
	
	public abstract void usar();


}
