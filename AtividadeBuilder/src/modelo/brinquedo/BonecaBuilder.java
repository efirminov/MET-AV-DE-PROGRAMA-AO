package modelo.brinquedo;

public class BonecaBuilder extends BrinquedoBuilder{
	
	private Brinquedo b = new Boneca();
	
	public void pegarbrinquedo () {
		System.out.println("Seu brinquedo � uma Boneca!.");
	}
	public Brinquedo getBrinquedo() {
		System.out.println("Seu brinquedo est� na Caixa!.");
		return b;
	}
	
	
}
