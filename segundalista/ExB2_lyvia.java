package segundalista;

import java.util.Scanner;

public class ExB2_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um ano qualquer:");
		int ano = scn.nextInt();
		
		//processamento
		if (ano % 4 == 0 )
			System.out.println("É um ano bissexto.");
		else
			System.out.println("Não é um ano bissexto.");
		scn.close();

	}

}
