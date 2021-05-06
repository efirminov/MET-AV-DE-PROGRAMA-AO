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
			System.out.println("inst�ncia n�o existia.....Criando inst�ncia de TipoRealAudio...");
			meuAudio = new TipoRealAudio(nomeArquivo);
		} else {
			System.out.println("Recuperando insrt�ncia anteriormente cirada de TipoRealAudio...");
		}
		
		meuAudio.play();
	}

}
