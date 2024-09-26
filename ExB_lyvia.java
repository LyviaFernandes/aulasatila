package segundalista;

import java.util.Scanner;

public class ExB_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//entrada
		System.out.println("Insira um valor inteiro positivo ou negativo:");
		int N = scn.nextInt();
		
		System.out.println("O resultado é: ");
		if (N < 0)
			System.out.println(N * -1);
		else
			System.out.println(+ N);
		
		scn.close();
		
	}

}
