package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Option3 {
	Scanner leia = new Scanner(System.in);
	int opcao;

	// menuPrevencao
	public void menuPrevencao() {

		System.out.println("Seja bem vindo ao sistema de prevenção ao súicidio "
				+ "aqui você terá algumas decisões a serem tomadas!\n" + "\n//A prevenção\\"
				+ "\nAs razões podem ser bem diferentes, porém muito mais gente do que se imagina já pensou em suicídio."
				+ " \nSegundo estudo realizado pela Unicamp, 17% dos brasileiros,"
				+ " em algum momento, pensaram seriamente em dar um fim à própria " + "\nvida e,"
				+ " desses, 4,8% chegaram a elaborar um plano para isso. Em muitos casos,"
				+ " é possível evitar que esses pensamentos" + "\nsuicidas se tornem realidade.");
		System.out.println("\n//CVV\\"
				+ "O CVV é uma das ONGs mais antigas do país. Fundado em São Paulo em 1962, atua no apoio emocional e "
				+ "na prevenção do "
				+ "\nsuicídio pelo telefone 188, " + "e também por chat, e-mail e pessoalmente.");
		System.out.println("\n[1] Encerrar o programa");
		System.out.println("[2] Menu Inicial");
		opcao = leia.nextInt();
		switch (opcao) {
		case 1:
			Encerramento encerramento = new Encerramento();
			encerramento.encerrar();
		case 2:
			Menu menu = new Menu();
			menu.menuInicio();
		}
		leia.close();
	}
}