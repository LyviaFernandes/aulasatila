package aula11;

import java.util.Scanner;

public class Loop_do_v1 {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		
		int i = 0;
		do {
			System.out.println("Digite um número: ");
			int num = snc.nextInt();
			System.out.println("Número = " + num );
			i++;
		} while(i < 5);
		snc.close();
	}

}
