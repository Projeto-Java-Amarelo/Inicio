package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Menu implements Opcao {
	Scanner leia = new Scanner(System.in);	
	int opcao;
	
	
	@Override
	public void menuInicio() {
			
		
		System.out.println("\nEscolha a opção que mais se enquadra:"
				+ "\n1.Paciente"
				+ "\n2.Médico");
		System.out.println("\nOpção: ");
		opcao = leia.nextInt();			
			
		switch(opcao) {
			case 1:
				menuPaciente();
				break;
			
			case 2:			
				LoginDoProfissional login = new LoginDoProfissional();
				login.login();
				break;
			
			default:				
				//chamar Método de limpar console
				System.out.println("Opção válida!");	
				menuInicio();
		}	
		
		
		leia.close();		
	}
	
	@Override
	public void menuPaciente() {
		
		System.out.println("\nEscolha a opção que mais se enquadra:"
				+ "\n1.Procedimento de Agendamento de Consulta no SUS"
				+ "\n2.Cadastrar seus dados na base"
				+ "\n3.Prevenção ao suicídio");
		System.out.println("\nOpção: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
			case 1: 
				//SUS
				break;
			
			case 2:
				//Cadastro
				break;
			
			case 3:
				//Prevenção
				break;
			default:
				//chamar Método de limpar console
				System.out.println("Opção válida!");
				menuPaciente();
				
		}
		leia.close();		
	}

	
}
