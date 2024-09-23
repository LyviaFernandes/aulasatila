package segundalista;

import java.util.Scanner;

public class ExA2_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//entrada
		System.out.println("Bem-Vindo");
		System.out.println("\nDigite um número inteiro");
		int num = scn.nextInt();
		
		//processamento
		if (num >= 0)
			System.out.println("É um número positivo");
		else
			System.out.println("É um número negativo");
		
		if
		(num % 2 >= 0)
			System.out.println("e é um número par.");
		else
			System.out.println("e é um número impar.");
		
		scn.close();

	}

}
