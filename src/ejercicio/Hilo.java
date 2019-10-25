package ejercicio;

public class Hilo implements Runnable{
	
	private Personaje personaje;
	private Boss boss;
	
	public Hilo(Personaje personaje, Boss boss) {
		this.personaje = personaje;
		this.boss = boss;
	}



	@Override
	public void run() {
		entrar();
		
		
	}
	
	public void entrar() {
		personaje.atacar(boss);
	}

}
