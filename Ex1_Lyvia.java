package segundalista;

import java.util.Scanner;

public class Ex1_Lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//variaveis
		int X = 1;
		int A = 3;
		int B = 5;
		int C = 8;
		int D = 7;
		
		
		//processamento
		if (X > 3)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
		if (X < 1 && B > D)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
		if (D < 0 && C > 5)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
		if (X > 3 || C < 7)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
		if (A > B || C > B)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
		if (X >= 2)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
		if (X < 1 && B > D)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
		if (D < 0 || C > 5)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
		
		scn.close();
		
	}

}
