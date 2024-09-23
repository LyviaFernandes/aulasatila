package segundalista;

import java.util.Scanner;

public class ExA3_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro não negativo");
		int num = scn.nextInt();
		
		if (num == 5 && num > 0)
			System.out.println(Math.sqrt(num));	
		else
			System.out.println(Math.cbrt(num));
		int valor = scn.nextInt();
		
		if (valor < 0)
			System.out.println("Operação encerrada.");
		else
			System.out.println("Valor: " + Math.ceil(valor));
		
		scn.close();
		
		
			
		
		
	}

}
