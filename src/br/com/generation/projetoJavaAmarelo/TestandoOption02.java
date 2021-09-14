package br.com.generation.projetoJavaAmarelo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestandoOption02 {
	public ArrayList<Option2> dados = new ArrayList<>();

	public ArrayList<Option2> pegaDado() {
		System.out.println("teste");		
		return dados;
	}
	/*
	public String imprimirDados(String dadosPaciente) {
		for (Option2 i : dadosPaciente) {
			System.out.println(i);
		}
		
	}*/
	
	
	public void aprentaOp2() {

		Scanner entrada = new Scanner(System.in);

		String nome;
		String email;
		String telefone;
		int quantidade;
		int opcao;
		
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

			dados.add(new Option2(nome, email, telefone));
		}

		for (Option2 i : dados) {
			System.out.println(i);
		}

		System.out.println("Dados cadastrados com sucesso!");

		System.out.println("[1] Encerrar o programa");
		System.out.println("[2] Menu Inicial");
		opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
			Encerramento encerramento = new Encerramento();
			encerramento.encerrar();
			
		case 2:
			Menu menu=new Menu();
			menu.menuInicio();
		}
		entrada.close();

	}

}
