package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Option1Sus {

	public void ApresentaOp() { // vamos tentar colocar esse método num método "pai" (de uma superclasse) pra
								// sobrecarrega-lo dentro das Op1, 2 e 3;
		Menu menu = new Menu();
		Scanner entrada = new Scanner(System.in);
		int resp = 1;
		System.out.println("************************** CONSULTA NO SUS <3 **************************\n");

		while (resp == 1) {
			System.out.println("1 - TER O CARTÃO DO SUS: ");
			System.out.println("Sempre que você usa os serviços do sistema único de saúde, precisará "
					+ "\napresentar seu cartão/carteirinha. É gratuito e simples de conseguir:"
					+ "\nbasta ir até uma unidade de saúde com o seu RG ou outro documento de "
					+ "\nidentificação com foto."
					+ "Após preencher um cadastro, sua carteirinha "
					+ "\nestará impressa e você já poderá ser atendido."
					+ "\n2 - IR ATÉ UMA UBS (Unidade básica de saúde) OU CAPS(Centro de atenção"
					+ "\npsicosocial): "
					+ "-Na UBS ou no CAPS você será direcionado para o acolhimento,"
					+ "\naonde um profissional fará uma triagem com diagnóstico inicial. -Após "
					+ "\ntriagem você poderá ser encaminhado para um psicólogo que tratará do seu "
					+ "\ncaso. Apenas casos gravíssimos vão pra hospitalização. -Com a consulta "
					+ "\nmarcada, você receberá um papel com a data marcada de sua consulta. -Daí é"
					+ "\nsó aguardar o dia e comparecer no horário correto da consulta.");
			System.out.println("\nDESEJA REPETIR A EXPLICAÇÃO ? " + "\n[1]SIM " + "\n[2] NÃO");
			resp = entrada.nextInt();
			if (resp == 2) {
				System.out.println("\nObrigado!" + "\nVoltando ao menu...");
				menu.menuInicio();
			}

		} // fechamento do while
		entrada.close();

	}// chave do ApresentaOp

}
