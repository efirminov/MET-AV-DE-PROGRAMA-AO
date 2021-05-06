package modelo.proxy;

public class ProxyAudio implements AudioIF {
	
	private TipoRealAudio meuAudio;
	private String nomeArquivo;
	
	//construtor 
	public ProxyAudio(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void play() {
		if (meuAudio == null) {
			System.out.println("instância não existia.....Criando instância de TipoRealAudio...");
			meuAudio = new TipoRealAudio(nomeArquivo);
		} else {
			System.out.println("Recuperando insrtância anteriormente cirada de TipoRealAudio...");
		}
		
		meuAudio.play();
	}

}
