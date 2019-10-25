package ejercicio;

public class Main {

	public static void main(String[] args) {
		Personaje bos = new Boss("Jose Antonio", new Ironia(""));
		Personaje gue1 = new Guerrero("Soma", new Espada("Bastarda"));
		Personaje mag = new Mago("Falacio", new Varita("Lobo"));
		Personaje ber = new Berseker("Franco", new Espada("Valle"));

		Hilo h1 = new Hilo(gue1, bos);
		Hilo h2 = new Hilo(mag, bos);
		Hilo h3 = new Hilo(ber, bos);

		Thread th1 = new Thread(h1);
		Thread th2 = new Thread(h2);
		Thread th3 = new Thread(h3);

		th1.start();
		th2.start();
		th3.start();

	}

}
