package ejercicio;

public class Ironia extends Arma{
	
	public Ironia(String tipo) {
		super();
		this.dano = 10;
		this.tipo = tipo;
	}

	@Override
	public void usar() {
		System.out.println("¿Sabes lo que pasa cuando juntas un enfermo mental con una sociedad que le da de lado y lo trata como escoria?"
				+ "Obtienes lo que mereces CABRON!!!!!");
		
	}

}
