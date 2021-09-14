package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class MenuPaciente implements Opcao {

	@Override
	public void menuPaciente() {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		System.out.println("\n*************************** MENU DO USUÁRIO ****************************\n");
		
		System.out.println(
				"Escolha a opção que mais se enquadra:" + "\n1.Procedimento de Agendamento de Consulta no SUS"
						+ "\n2.Cadastrar seus dados na base" + "\n3.Prevenção ao suicídio");
		System.out.println("\nOpção: ");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			Option1 option1 = new Option1();
			option1.ApresentaOp();
			break;

		case 2:
			TestandoOption02 option2 = new TestandoOption02();
			option2.apresentaOp2();
			break;

		case 3:
			Option3 prevencao = new Option3();
			prevencao.menuPrevencao();
			break;
		default:
			// chamar Método de limpar console
			System.out.println("Opção válida!");
			menuPaciente();

		}
		entrada.close();
	}

	@Override
	public void menuInicio() {
		// TODO Auto-generated method stub

	}

}
