package aula11;

import java.util.Scanner;

public class Loop_While2 {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		
		int i = 0;
		do {
			
			System.out.println("Digite um número = ");
			int num = snc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("Numero =" + num);
			} i++;
			
		}while(i < 10);
		
		snc.close();
	}

}
