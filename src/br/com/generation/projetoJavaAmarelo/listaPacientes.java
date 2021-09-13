package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;
import java.util.Arrays;

public class listaPacientes {

	public void listaPaciente() {

		String[][] matriz = new String[2][4];
		Scanner ler = new Scanner(System.in);

		// Preenchimento de formulario linha 18-34

		for (int l = 0; l < 2; l++) { // um loop que permite l quantidade de cadastro /linha
			for (int c = 0; c < 4; c++) { // preencher 4 colunas por linha
				if (c == 0) {
					System.out.print("Digite o seu nome completo: ");
					matriz[l][c] = ler.nextLine();
				}
				if (c == 1) {
					System.out.print("Digite o seu CPF: ");
					matriz[l][c] = ler.nextLine();
				}
				if (c == 2) {
					System.out.print("Digite o seu e-mail ");
					matriz[l][c] = ler.nextLine();
				}
				if (c == 3) {
					System.out.print("Digite o seu endereço ");
					matriz[l][c] = ler.nextLine();

				}

			}

		}

		ler.close();

	}

}
