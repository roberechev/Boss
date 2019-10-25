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

	public void setDano(double dano) {
		this.dano = dano;
	}
	
	public abstract void usar();


}
