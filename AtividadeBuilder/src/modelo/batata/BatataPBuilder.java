package modelo.batata;

public class BatataPBuilder extends BatataFritasBuilder {
	private Batata p = new BatataP();
	
	public void porcaopequena() {
		System.out.println("Sua por��o � Pequena!.");
	}
	public Batata getBatata() {
		System.out.println("Aqui est� sua por��o Pequena de batata");
		return p;
		
	}
	public Batata getBt() {
		return p;
	}
	public void setBt(Batata p) {
		this.p = p;
	}
	
	public void porcaomedia() {
		
		
	}
	
	public void porcaogrande() {
		
		
	}

}
