package ejercicio;

public class Boss extends Personaje{
	
	public Boss(String nombre, Arma arma) {
		this.pv = 1000;
		this.nombre = "El Bromas";
		this.arma = arma;
	}

	@Override
	public void atacar(Personaje objetivo) {
		System.out.println("Soy " + this.getNombre() + " y te reviento con mi " + arma.getTipo()+ " que quita " + arma.getDano());
		arma.usar();

		objetivo.setPv((int) (objetivo.getPv() - arma.getDano()));

		System.out
				.println("Mi enemigo " + objetivo.getNombre() + " ahora tiene " + objetivo.getPv() + " puntos de vida");
		
	}

	@Override
	public void resetearVida() {
		this.pv = 1000;
		
	}
	
	
	

}
