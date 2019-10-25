package ejercicio;

public class Berseker extends Personaje {

	public Berseker(String nombre, Arma arma) {
		super();
		this.pv = 100;
		this.nombre = nombre;
		this.arma = arma;
	}

	@Override
	public void atacar(Personaje objetivo) {
		System.out.println("Soy el berseker " + this.getNombre() + " y te reviento con mi " + arma.getTipo()+ " que quita " + arma.getDaño());
		arma.usar();

		objetivo.setPv((int) (objetivo.getPv() - arma.getDaño()));

		System.out
				.println("Mi enemigo " + objetivo.getNombre() + " ahora tiene " + objetivo.getPv() + " puntos de vida");
	}

	@Override
	public void resetearVida() {
		this.pv = 75;

	}

}
