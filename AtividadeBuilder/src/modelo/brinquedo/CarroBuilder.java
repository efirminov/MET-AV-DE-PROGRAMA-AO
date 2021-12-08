package modelo.brinquedo;

public class CarroBuilder extends BrinquedoBuilder {
	private Brinquedo c = new Carro();
	
	public void pegarbrinquedo() {
		System.out.println("Seu brinquedo é um Carro!.");
	}
	public Brinquedo getBrinquedo() {
		System.out.println("Seu brinquedo está na Caixa!.");
		return c;
	}
	

}
