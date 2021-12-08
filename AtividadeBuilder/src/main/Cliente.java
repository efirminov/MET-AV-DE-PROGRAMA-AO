package main;

import modelo.batata.BatataFrita;
import modelo.batata.BatataGBuilder;
import modelo.batata.BatataM;
import modelo.batata.BatataMBuilder;
import modelo.batata.BatataPBuilder;
import modelo.brinquedo.BonecaBuilder;
import modelo.brinquedo.CarroBuilder;
import modelo.brinquedo.Entrega;
import modelo.refrigerante.Cocabuilder;
import modelo.refrigerante.GuaranabBuilder;
import modelo.sanduiche.CheeseburgueBuilder;
import modelo.sanduiche.Cozinha;
import modelo.sanduiche.HamburguerBuilder;
import modelo.sanduiche.SanduicheBuilder;
import modelo.sanduiche.Servir;

public class Cliente {
	public static void main(String[] args) {
		Cozinha cuzinha = new Cozinha();
		Servir servir = new Servir();
		Entrega brinquedo = new Entrega();
		BatataFrita batata = new BatataFrita();

		SanduicheBuilder combo1 = new HamburguerBuilder();
		SanduicheBuilder combo2 = new CheeseburgueBuilder();

		Cocabuilder coca = new Cocabuilder();
		GuaranabBuilder guarana = new GuaranabBuilder();

		CarroBuilder menino = new CarroBuilder();
		BonecaBuilder menina = new BonecaBuilder();

		BatataGBuilder g = new BatataGBuilder();
		BatataPBuilder p = new BatataPBuilder();
		BatataMBuilder m = new BatataMBuilder();

		cuzinha.fazsanduiche(combo1);
		combo1.getSanduiche();

		servir.fazrefri(coca);
		coca.getrefrigerante();

		brinquedo.entregabrinquedo(menino);
		menino.getBrinquedo();

		batata.fazbatata(g);
		g.getBatata();
		
		System.out.println("================================================");
		cuzinha.fazsanduiche(combo2);
		combo2.getSanduiche();

		servir.fazrefri(guarana);
		guarana.getrefrigerante();

		brinquedo.entregabrinquedo(menina);
		menina.getBrinquedo();

		batata.fazbatata(m);
		m.getBatata();

	}

}
