package modelo.refrigerante;

public class GuaranabBuilder extends RefrigeranteBuilder {
	private Refrigerante r = new Guarana();

	public void pegarrefri() {
		System.out.println("Pegar o refrigerante!.");
	}

	public void servirrefrigerante() {
		System.out.println("Servir a Guaran� de 1L!.");
	}

	public Refrigerante getrefrigerante() {

		System.out.println("A Guarana est� fora da Caixa!");
		return r;
	}

	public Refrigerante getR() {
		return r;
	}

	public void setR(Refrigerante r) {
		this.r = r;
	}

}
