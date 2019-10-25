package ejercicio;

public class Varita extends Arma{
	
	public Varita(String tipo) {
		super();
		this.dano = 50;
		this.tipo = tipo;
	}

	@Override
	public void usar() {
		System.out.println("En nombre de voldemora");
		
	}

}
