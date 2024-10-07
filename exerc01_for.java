package aula11;

import java.util.Scanner;

public class exerc01_for {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			int num = scn.nextInt();
			System.out.println("Numero: " + num);
		}
		scn.close();
	}

}
