package modelo.sanduiche;

public class CheeseburgueBuilder extends SanduicheBuilder {

	public void abrepao() {
		System.out.println("Abre o p�o de Cheeseburgue!.");
	}

	public void inserirIngredientes() {
		System.out.println("Insere carne e queijo!.");
	}

	public void fecharpao() {
		System.out.println("Fechar o p�o de Cheeseburguer!.");
	}

	public void getSanduiche() {
		System.out.println("Cheeseburguer est� pronto!.");
	}

}
