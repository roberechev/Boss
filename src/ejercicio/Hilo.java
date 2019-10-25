package ejercicio;

public class Hilo implements Runnable{
	
	private Personaje personaje, boss;
	
	public Hilo(Personaje personaje, Personaje boss) {
		this.personaje = personaje;
		this.boss = boss;
	}



	@Override
	public void run() {
		personaje.atacar(boss);
		
	}

}
