package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Option3 {
	Scanner leia = new Scanner(System.in);
	int opcao;

	// menuPrevencao
	public void menuPrevencao() {
		System.out.println("\n**************************** PREVENÇÃO *********************************");
		System.out.println("Seja bem vindo ao sistema de prevenção ao súicidio " + "aqui você terá "
				+ "\nalgumas decisões" + "na serem tomadas!\n" 
				+ "\n|A prevenção|"
				+ "\nAs razões podem ser bem diferentes, porém muito mais "
				+ "\ngente do que se imagina já pensou em suicídio.Segundo estudo realizado "
				+ "\npela Unicamp, 17% dos brasileiros,em algum momento, pensaram seriamente "
				+ "\nem dar um fim à própria vida e,desses, 4,8% chegaram a elaborar um"
				+ "\nplano para isso. Em muitos casos, é possível evitar que esses pensamentos"
				+ "\nsuicidas se tornem realidade.");
		System.out.println("\n|CVV|"
				+ "\nO CVV é uma das ONGs mais antigas do país. Fundado em São Paulo em "
				+ "\n1962, atua no apoio emocional e "
				+ "na prevenção do " + "\nsuicídio pelo telefone 188, " + "e também por chat, e-mail e pessoalmente.");
		System.out.println("\n[1] Encerrar o programa");
		System.out.println("[2] Menu Inicial");
		opcao = leia.nextInt();
		switch (opcao) {
		case 1:
			Encerramento encerramento = new Encerramento();
			encerramento.encerrar();
			break;
		case 2:
			Menu menu = new Menu();
			menu.menuInicio();
		}
		leia.close();
	}
}