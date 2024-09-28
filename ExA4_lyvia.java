package testando;

import java.util.Scanner;

public class ExA4_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("entre com um valor numérico real não negativo ");
		int num = scn.nextInt();
		
		if (num != 5 && num > 0) {
			System.out.println("O resultado é: ");
			System.out.println(Math.sqrt(num));
	} else if (num == 5) {
		System.out.println("O resultado é: ");
		System.out.println(Math.cbrt(num));
	}
		
	else
		System.out.println("nada");
		
		scn.close();
	}

}
