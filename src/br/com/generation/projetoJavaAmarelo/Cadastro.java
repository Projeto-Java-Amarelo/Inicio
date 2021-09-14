package br.com.generation.projetoJavaAmarelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
	public ArrayList<SuperCadastro> dados = new ArrayList<>();

	/*
	 * public ArrayList<Option2> pegaDado() { //System.out.println("teste"); return
	 * dados; }
	 */

	/*
	 * public String imprimirDados(String dadosPaciente) { for (Option2 i :
	 * dadosPaciente) { System.out.println(i); }
	 * 
	 * }
	 */

	public void cadastrando() {

		Scanner entrada = new Scanner(System.in);

		String nome;
		String email;
		String telefone;
		int quantidade;
		int opcao;
		
		System.out.println("\n******************************** CADASTRO *******************************\n");
		System.out.println("Quantos usuários você quer cadastrar? ");
		quantidade = entrada.nextInt();

		for (int i = 0; i < +quantidade; i++) {

			System.out.println("Nome: ");
			nome = entrada.nextLine();
			nome = entrada.nextLine();
			// entrada.nextLine();

			System.out.println("Telefone: ");

			telefone = entrada.nextLine();
			// entrada.nextLine();

			System.out.println("E-mail:");
			email = entrada.nextLine();

			dados.add(new SuperCadastro(nome, email, telefone));
		}

		for (SuperCadastro i : dados) {
			System.out.println(i);
		}

		System.out.println("Dados cadastrados com sucesso!");

		System.out.println("[1] Encerrar o programa");
		System.out.println("[2] Menu Inicial");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			Encerramento encerramento = new Encerramento();
			encerramento.encerrar();

		case 2:
			Menu menu = new Menu();
			menu.menuInicio();
		}
		entrada.close();

	}

	public void imprimindo() {

		for (SuperCadastro i : dados)
			System.out.println(i);
	}

}
