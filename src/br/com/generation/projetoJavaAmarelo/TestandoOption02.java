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

		Menu menu = new Menu();
		menu.menuInicio();

		entrada.close();

	}

}
