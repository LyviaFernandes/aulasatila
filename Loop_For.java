package aula11;

import java.util.Scanner;

public class Loop_For {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++);
		System.out.println("Digite um número: ");
		int num = scn.nextInt();
		System.out.println("Número = " + num );
		scn.close();
	}

}
