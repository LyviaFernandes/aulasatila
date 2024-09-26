package segundalista;

import java.util.Scanner;

public class Ex3_Lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro.");
		int A = scn.nextInt();
		
		System.out.println("Digite outro número inteiro.");
		int B = scn.nextInt();
		
		//processamento
		System.out.println("A diferença dos números é: ");
		if (A > B)
			System.out.println( A - B);
		else
			System.out.println( B - A);
		
		scn.close();
		
	}

}
