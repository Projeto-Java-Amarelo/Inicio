package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class ListaPacientes {

	public void imprimir() {

		Scanner entrada = new Scanner(System.in);

		String[][] matriz = new String[3][3];

		matriz[0][0] = " NOME ";
		matriz[0][1] = "| TELEFONE ";
		matriz[0][2] = "| E-MAIL";

		matriz[1][0] = " Antonio Marques Santos ";
		matriz[1][1] = " 11987452158 ";
		matriz[1][2] = " Antonio.Marques@gmail.com ";

		matriz[2][0] = " Elizabeth Marques Santos ";
		matriz[2][1] = " 1197596158 ";
		matriz[2][2] = " Elizabeth.Marques@gmail.com ";

		for (int l = 0; l < 3; l++) {
			System.out.println(" ");
			for (int c = 0; c < 3; c++) {
				System.out.print("| " + matriz[l][c]);
			}
		}

		entrada.close();
	}

}
