package segundalista;

import java.util.Scanner;

public class ExE_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int A = scn.nextInt();
		
		System.out.println("Digite mais um número inteiro");
		int B = scn.nextInt();
		
		System.out.println("Digite outro número inteiro");
		int C = scn.nextInt();
		
		if (A >= B && B >= C)
			System.out.println(C + ", " + B + ", " + A);
		else if (C >= A && B <= A)
			System.out.println(B + ", " + A + ", " + C);
		else if (B >= C && A <= C)
			System.out.println(A + ", " + C + ", " + B);
		else if (B >= A && C <= A)
			System.out.println(C + ", " + A + ", " + B);
		else if (B <= C && A >= C)
			System.out.println(B + ", " + C + ", " + A);
		else if (B <= C && A <= B)
			System.out.println(A + ", " + B + ", " + C);
		scn.close();
	}

}
