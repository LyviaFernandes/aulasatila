package aula09;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o número 1: ");
		float n1 = scn.nextFloat();
		
		System.out.println("Digite o número 2: ");
		float n2 = scn.nextFloat();
		
		System.out.println("Calculadora básica...");
		System.out.println("Operações");
		System.out.println("1- Adição");
		System.out.println("2- Multiplicação");
		System.out.println("3- Subtração");
		System.out.println("4- Divisão");
		System.out.println("5- Potencia");
		System.out.println("6- Sair");
		int operacao = scn.nextInt();
		
		switch (operacao) {
		case 1: System.out.println("Soma: " + (n1 + n2)); 			break;
		case 2: System.out.println("Multiplicação: " + (n1 * n2)); 	break;
		case 3: System.out.println("Subtração: " + (n1 - n2)); 		break;
		case 4:
			if (n2 != 0) {
				System.out.println("A divisão entre os números é: " + (n1 / n2));
				
			} else {
				System.out.println("Não dividir por zero"); 		
			}														break;
		case 5: System.out.println("Potência: " + Math.pow(n1, n2));break;
		default: 													break;
		}
		System.out.println("Fim do programa!");
		
		scn.close();
	}

}
