package br.com.generation.projetoJavaAmarelo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestandoOption2 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		ArrayList<Option2> dados = new ArrayList<>();
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
			//entrada.nextLine();

			System.out.println("Telefone: ");
			
			telefone = entrada.nextLine();
			//entrada.nextLine();

			System.out.println("E-mail:");
			email = entrada.nextLine();

			dados.add(new Option2 (nome, email, telefone)); // é necessário criar um objeto para ser salvo essa
			//variável, que não
			// pode ser usada fora do for
		}

		for (Option2 i : dados) {
			System.out.println(i);
		}

		entrada.close();
	}

}
