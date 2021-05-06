package modelo.proxy;
//Class concreta  
public class TipoRealAudio implements AudioIF {
	//atributo do tipoRealAudio
	private String nomeArquivo;
	
	//construtor
	public TipoRealAudio(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		carregandoArquivo(nomeArquivo);
	}
	
	public void play() {
		System.out.println("Tocando o arquivo de " + nomeArquivo);
	}
	
	public void carregandoArquivo(String carregandoArquivo) {
		System.out.println("Carregando arquivo " + nomeArquivo + " do disco.");
	}
}
