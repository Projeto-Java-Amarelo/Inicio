package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class LoginDoProfissional {

	private String emailMedicoLegal = "medicolegal@gmail.com";
	private String emailInformado;
	private String senhaMedicoLegal = "12345678";
	private String senhaInformada;

	public String getEmailMedicoLegal() {
		return emailMedicoLegal;
	}

	public void setEmailMedicoLegal(String emailMedicoLegal) {
		this.emailMedicoLegal = emailMedicoLegal;
	}

	public String getEmailInformado() {
		return emailInformado;
	}

	public void setEmailInformado(String emailInformado) {
		this.emailInformado = emailInformado;
	}

	public String getSenhaMedicoLegal() {
		return senhaMedicoLegal;
	}

	public void setSenhaMedicoLegal(String senhaMedicoLegal) {
		this.senhaMedicoLegal = senhaMedicoLegal;
	}

	public String getSenhaInformada() {
		return senhaInformada;
	}

	public void setSenhaInformada(String senhaInformada) {
		this.senhaInformada = senhaInformada;
	}

	void Login() { // só pode ter um main por projeto. é a parte principal dele

		LoginDoProfissional login1 = new LoginDoProfissional();
		Scanner entrada = new Scanner(System.in);
		int tentativas = 1;

		while (tentativas <= 3) {

			System.out.println("Insira seu e-mail:");
			emailInformado = entrada.next();
			login1.setEmailInformado(emailInformado);

			System.out.println("Digite a senha:");
			senhaInformada = entrada.next();
			login1.setSenhaInformada(senhaInformada);

			if (emailMedicoLegal.equals(login1.getEmailInformado())
					&& senhaMedicoLegal.equals(login1.getSenhaInformada())) {
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
