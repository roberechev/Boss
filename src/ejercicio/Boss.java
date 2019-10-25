package ejercicio;

public class Boss {

	private int pv;
	private String nombre;
	private Arma arma;

	public Boss(String nombre, Arma arma) {
		this.pv = 2250;
		this.nombre = "El Bromas";
		this.arma = arma;
	}

	public synchronized void esAtacado(Personaje objetivo) {
		System.out.println(
				"Soy " + this.getNombre() + " y te reviento con mi " + arma.getTipo() + " que quita " + arma.getDano());
		arma.usar();

		int counter = 1;
		
		//boolean continuar = true;
		while (this.getPv() > 0 && objetivo.getPv() > 0) {
			
			double random = (Math.random());
			int danoPersonaje = (int) (objetivo.getEspada().getDano() + (objetivo.getEspada().getDano() * random));

			this.pv = (int) (pv -  danoPersonaje);

			objetivo.setPv((int) (objetivo.getPv() - arma.getDano()));

			System.out.println("Ataque a " + objetivo.getNombre() + " número " + counter);
			System.out.println("Daño del personaje " + danoPersonaje);

			System.out.println("Vida de " + this.getNombre() + " boss: " + this.getPv() + " Vida del personaje " + objetivo.getPv());

			counter++;
			
			

			try {
				Thread.sleep(1000);// un obrero descansa 10 segundos
				
				if (this.getPv() <= 0) {
					System.out.println(this.getNombre() + " HA SIDO DERROTADO!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		try {
			Thread.sleep(1000);// un obrero descansa 10 segundos
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out
				.println("Mi enemigo " + objetivo.getNombre() + " ahora tiene " + objetivo.getPv() + " puntos de vida");

	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

}
