package segundalista;

import java.util.Scanner;
public class ExD_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		int idade = scn.nextInt();
		
		if (idade >= 18 && idade <= 59)
			System.out.println("Maior de idade.");
		else if (idade < 18 && idade > 12)
			System.out.println("Menor de idade");
		else if (idade >= 60)
			System.out.println("Idoso");
		else if (idade <= 12)
		System.out.println("Infancia");
		scn.close();
			
	}

}
