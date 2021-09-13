package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

	public class Prevencao {
		Scanner leia = new Scanner(System.in);
		int opcoes;
		
		//menuPrevencao
		public void menuPrevencao() {
			
			System.out.println("Seja bem vindo ao sistema de prevenção ao súicidio, "
					+ "aqui você terá algumas decisões a serem tomadas!" +
					"\n//A prevenção\\"
					+ "\nAs razões podem ser bem diferentes, porém muito mais gente do que se imagina já pensou em suicídio."
					+ " Segundo estudo realizado pela Unicamp, 17% dos brasileiros,"
					+ " em algum momento, pensaram seriamente em dar um fim à própria vida e,"
					+ " desses, 4,8% chegaram a elaborar um plano para isso. Em muitos casos,"
					+ " é possível evitar que esses pensamentos suicidas se tornem realidade.");
			System.out.println("\n//CVV\\"
					+ "O CVV é uma das ONGs mais antigas do país. Fundado em São Paulo em 1962, atua no apoio emocional e "
					+ "na prevenção do suicídio pelo telefone 188, "
					+ "e também por chat, e-mail e pessoalmente.");
			System.out.println("Digite Para:"
					+ "\n[1]: Menu Inicial "
					+ "\n[2]: Encerrar o programa ");
			
			switch(opcoes) {
				case 1:
					Menu menu = new Menu();
					menu.menuInicio();
							
				case 2:						
					break;					
					default: 
						System.out.println("Opção inválida!");
						menuPrevencao();
					
			}
			leia.close();
		}
	 }