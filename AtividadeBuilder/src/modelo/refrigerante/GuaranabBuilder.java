package modelo.refrigerante;

public class GuaranabBuilder extends RefrigeranteBuilder {
	private Refrigerante r = new Guarana();

	public void pegarrefri() {
		System.out.println("Pegar o refrigerante!.");
	}

	public void servirrefrigerante() {
		System.out.println("Servir a Guaraná de 1L!.");
	}

	public Refrigerante getrefrigerante() {

		System.out.println("A Guarana está fora da Caixa!");
		return r;
	}

	public Refrigerante getR() {
		return r;
	}

	public void setR(Refrigerante r) {
		this.r = r;
	}

}
