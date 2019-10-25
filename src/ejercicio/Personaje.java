package ejercicio;

public abstract class Personaje {

	protected String nombre;
	protected int pv;

	protected Arma arma;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public Arma getEspada() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public abstract void atacar(Personaje objetivo);

	public abstract void resetearVida();

}
