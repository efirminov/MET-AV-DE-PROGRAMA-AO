package modelo.brinquedo;

public class BonecaBuilder extends BrinquedoBuilder{
	
	private Brinquedo b = new Boneca();
	
	public void pegarbrinquedo () {
		System.out.println("Seu brinquedo é uma Boneca!.");
	}
	public Brinquedo getBrinquedo() {
		System.out.println("Seu brinquedo está na Caixa!.");
		return b;
	}
	
	
}
