package br.com.generation.projetoJavaAmarelo;

public class Inicio {

	public static void main(String[] args) {

		System.out.println("************************** SEJA BEM VINDO(A) ***************************\n");
		System.out.println("Olá,seja bem vindo(a), estamos no setembro amarelo, e esse projeto tem o");
		System.out.println("objetivo de encurtar distâncias.");

		// LoginDoProfissional login1 = new LoginDoProfissional(); // para se linkar uma
		// classe na outra é igual o processo
		// que se faz com o Scanner
		// login1.login();

		Menu menu = new Menu();

		menu.menuInicio();

	}
}
