package principal.teste;

import modelo.proxy.AudioIF;
import modelo.proxy.ProxyAudio;

public class ProxyDemo {
	public static void main(String[] args) {
		AudioIF meuAudio = new ProxyAudio("meuArquivo.mp3");
		
		//Criar
		meuAudio.play();
		System.out.println();

		//Reaproveitar
		meuAudio.play();
		System.out.println();
	}

}
