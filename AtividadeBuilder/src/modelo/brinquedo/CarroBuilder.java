package modelo.brinquedo;

public class CarroBuilder extends BrinquedoBuilder {
	private Brinquedo c = new Carro();
	
	public void pegarbrinquedo() {
		System.out.println("Seu brinquedo � um Carro!.");
	}
	public Brinquedo getBrinquedo() {
		System.out.println("Seu brinquedo est� na Caixa!.");
		return c;
	}
	

}
