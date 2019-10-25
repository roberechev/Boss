package ejercicio;

public class Guerrero extends Personaje {

	public Guerrero(String nombre, Arma arma) {
		super();
		this.pv = 100;
		this.nombre = nombre;
		this.arma = arma;
	}

	
	@Override
	public void resetearVida() {
		this.pv = 100;
		
	}

	@Override
	public void atacar(Boss boss) {
		boss.esAtacado(this);
		
	}
}
