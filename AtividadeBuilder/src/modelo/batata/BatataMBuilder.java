package modelo.batata;

public class BatataMBuilder extends BatataFritasBuilder {
	private Batata m = new BatataM();

	public void porcaomedia() {
		System.out.println("Sua porção é media!.");
	}

	public Batata getBatata() {
		System.out.println("Aqui está sua porção Média de batata!.");
		return m;
	}

	public Batata getBt() {
		return m;
	}

	public void setBt(Batata m) {
		this.m = m;
	}

	public void porcaopequena() {

	}

	public void porcaogrande() {

	}

}
