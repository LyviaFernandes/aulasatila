package aula11;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			int num = scn.nextInt();
			soma = soma + num;
		}
			System.out.println("soma = " + soma);
			scn.close();
		
	}

}
