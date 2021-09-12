package br.com.generation.projetoJavaAmarelo;
import java.util.Scanner;

public class Option1{
	

	 

	public static void ApresentaOp() { //vamos tentar colocar esse método num método "pai" (de uma superclasse) pra sobrecarrega-lo dentro das Op1, 2 e 3;
	Scanner ler = new Scanner(System.in);
	int resp=1;
   
    while(resp==1) {
	System.out.println("1 - TER O CARTÃO DO SUS: ");
	System.out.println("Sempre que você usa os serviços do sistema único de saúde, precisará apresentar seu cartão/carteirinha");
	System.out.println("Ele é gratuito e simples de conseguir: basta ir até uma unidade de saúde com o seu RG ou outro documento de identificação com foto.");
	System.out.println("Após preencher um cadastro, sua carteirinha estará impressa e você já poderá ser atendido.");
	System.out.println("\n2 - IR ATÉ UMA UBS (Unidade básica de saúde) OU CAPS(Centro de atenção psicosocial): ");
	System.out.println("-Na UBS ou no CAPS você será direcionado para o acolhimento, aonde um profissional fará uma triagem com diagnóstico inicial.");
	System.out.println("-Após triagem você poderá ser encaminhado para um psicólogo que tratará do seu caso. Apenas casos gravíssimos vão pra hospitalização.");
	System.out.println("-Com a consulta marcada, você receberá um papel com a data marcada de sua consulta.");
	System.out.println("-Daí é só aguardar o dia e comparecer no horário correto da consulta.");
	System.out.println("\nDESEJA REPETIR A EXPLICAÇÃO ? 1=SIM 2 = NÃO");
	resp = ler.nextInt();
   if(resp==2) {
    	System.out.println("\nOBRIGADO!\nVOLTANDO AO INICIO...");
    	Inicio.main(null);
   }	
	
	
	
	}//fechamento do while
    ler.close();
	
	}//chave do ApresentaOp
	
	
	
	
	
	
	
	
	
}
