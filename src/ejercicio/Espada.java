package ejercicio;

public class Espada extends Arma{
	
	public Espada(String tipo) {
		super();
		this.dano = 50;
		this.tipo = tipo;
	}
	
	public void usar() {
		System.out.println("swiiiing");
	}
}
