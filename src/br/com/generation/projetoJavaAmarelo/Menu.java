package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Menu implements Opcao {
	Scanner entrada = new Scanner(System.in);
	int opcao;

	@Override
	public void menuInicio() {
		//72 CARACTERES
		System.out.println("\n********************************* MENU *********************************\n");
		System.out.println("Escolha a opção que mais se enquadra:" + "\n[1]Usuário" + "\n[2]Médico");
		//System.out.println("\nOpção: ");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			MenuUsuario menuUsuario = new MenuUsuario();
			menuUsuario.menuUsuario();
			break;

		case 2:
			LoginDoProfissional login = new LoginDoProfissional();
			login.login();
			break;

		default:
			// chamar Método de limpar console
			System.out.println("Opção válida!");
			menuInicio();
		}

		entrada.close();
	}

	@Override
	public void menuUsuario() {
		// TODO Auto-generated method stub
		
	}

}
