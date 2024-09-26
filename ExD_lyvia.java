package segundalista;

import java.util.Scanner;

public class ExD_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		double A = scn.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		double B = scn.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		double C = scn.nextDouble();
		
		//processamento
		double delta = Math.pow(B, 2) - 4 * A * C;
		
		double X = (-B + Math.sqrt(delta)) / (2 * A);
		double X1 = (-B - Math.sqrt(delta)) / (2 * A);
		
		if (delta < 0)
			System.out.println("Não há uma solução real.");
		else if (delta > 0)
			System.out.println("Há duas soluções reais e diferentes: " + X + " e " + X1);
		else
			System.out.println("Há apenas uma solução real: " + X);
		 
		scn.close();
		
	}

}
