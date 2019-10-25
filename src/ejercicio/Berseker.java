package ejercicio;

public class Berseker extends Personaje {

	public Berseker(String nombre, Arma arma) {
		super();
		this.pv = 100;
		this.nombre = nombre;
		this.arma = arma;
	}

	@Override
	public void atacar(Boss boss) {
		boss.esAtacado(this);
	}

	@Override
	public void resetearVida() {
		this.pv = 75;

	}


}
