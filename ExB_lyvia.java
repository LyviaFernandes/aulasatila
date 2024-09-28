package testando;

import java.util.Scanner;
public class ExB_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o valor de um peso");
		double p1 = scn.nextDouble();
		
		System.out.println("Digite o valor de outro peso");
		double p2 = scn.nextDouble();
		
		System.out.println("Digite o valor de mais um peso");
		double p3 = scn.nextDouble();
		
		if (p1 > p2 && p1 > p3) {
			System.out.println("O maior peso é: " + p1);
		}
		else if (p2 > p1 && p2 > p3)
			System.out.println("O maior peso é: " + p2);
		else
			System.out.println("O maior peso é: " + p3);
		
		scn.close();
	}

}
