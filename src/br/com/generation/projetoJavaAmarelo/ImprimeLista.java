package br.com.generation.projetoJavaAmarelo;

public class ImprimeLista extends listaPacientes {

	public void imprimindo() {
		
		
		listaPacientes lista = new listaPacientes();
		
		
		String[][] matriz = new String[2][4]; 
		
		System.out.print("********Nome********, ****CPF****, ****e-mail****, ****Endereço****");
		for (int l1 = 0; l1 < 2; l1++) {
			System.out.println(" | ");
			for (int c1 = 0; c1 < 4; c1++) {

				System.out.print(" | " + matriz[l1][c1] + "|");

			}

		}

	}

}
