package modelo.sanduiche;

public class HamburguerBuilder extends SanduicheBuilder {
	private Sanduiche s = new Hamburguer();
	
	public void abrepao() {
		System.out.println("Abre o p�o de hamburguer!.");
		
	}

	
	public void inserirIngredientes() {
		System.out.println("Insere carne!.");
		
	}

	
	public Sanduiche getS() {
		return s;
	}


	public void setS(Sanduiche s) {
		this.s = s;
	}


	public void fecharpao() {
		System.out.println("Fechar o p�o de Hamburguer!.");
		
	}
	
	


	public void getSanduiche() {
		System.out.println("Hamburguer est� pronto ");
		
	}

	

}
