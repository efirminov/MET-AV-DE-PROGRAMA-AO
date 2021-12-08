package modelo.batata;

public class BatataGBuilder extends BatataFritasBuilder {
	private Batata g = new batataG();
	
	public void porcaogrande() {
		System.out.println("Sua porção é Grande!.");
	}
	public Batata getBatata() {
		System.out.println("Aqui está sua porção Grande de batata!.");
		return g;
		
	}
	public Batata getBt() {
		return g;
	}
	public void setBt(Batata g) {
		this.g = g;
	}
	
	public void porcaopequena() {
		
		
	}
	
	public void porcaomedia() {
		
		
	}

}
