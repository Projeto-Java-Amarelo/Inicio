package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class LoginDoProfissional {

	void Login() { // só pode ter um main por projeto. é a parte principal dele

		String emailMedicoLegal = "medicolegal@gmail.com", emailInformado, senhaMedicoLegal = "12345678",
				senhaInformada;
		Scanner entrada = new Scanner(System.in);
		int tentativas = 1;

		while (tentativas <= 3) {

			System.out.println("Insira seu e-mail:");
			emailInformado = entrada.next();

			System.out.println("Digite a senha:");
			senhaInformada = entrada.next();

			if (emailMedicoLegal.equals(emailInformado) && senhaMedicoLegal.equals(senhaInformada)) {
				// Strings não são do tipo primitivo,
				// então para compará-las, se usa o
				// .equals()

				System.out.println("Bem vindo.");
				break;

			} else {
				System.out.println("E-mail ou senha incorretos, tente novamente.");
			}

		}

		entrada.close();
	}
}
