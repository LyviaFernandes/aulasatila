package segundalista;

import java.util.Scanner;

public class ExC_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//entrada
		System.out.println("Digite a primeira nota: ");
		double N1 = scn.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double N2 = scn.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double N3 = scn.nextDouble();
		
		System.out.println("Digite a quarta nota");
		double N4 = scn.nextDouble();
		
		//processamento
		double MD1 = (N1 + N2 + N3 + N4) / 4;
		if (MD1 >= 7) {
			System.out.println("Aprovado!");
		}
		else 
			System.out.println("Digite a nota de exame: ");
		double NE = scn.nextDouble();
		
		double MD2 = (N1 + N2 + N3 + N4 + NE) / 5;
		if (MD2 >= 5)
			System.out.println("Aprovado em exame!");
		else
			System.out.println("Reprovado.");
		System.out.println("Sua média foi de: " + MD2);
		
		scn.close();
	}

}
