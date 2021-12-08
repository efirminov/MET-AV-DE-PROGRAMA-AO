package modelo.refrigerante;

public class Cocabuilder extends RefrigeranteBuilder {
	private Refrigerante c = new Coca();
	
	public Refrigerante getR() {
		return c;
	}
	public void setR(Refrigerante c) {
		this.c = c;
	}
	public void pegarrefri() {
		System.out.println("pegar o seu refrigerante!.");
	}
	 public void servirrefrigerante() {
		 System.out.println("servir a coca-cola de 1L!.");
	 }
	 
	
	public Refrigerante getrefrigerante() {
		
		System.out.println("A Coca-cola está fora da Caixa!.");
		return c;
	}

}
