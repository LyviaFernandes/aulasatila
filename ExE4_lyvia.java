package testando;

import java.util.Scanner;

public class ExE4_lyvia {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			
			//Entrada
			System.out.println("Digite o primeiro número: ");
			double num1 = scn.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			double num2 = scn.nextDouble();
			
			//adição
			double adicao = num1 + num2;
			
			//subtração
			double sub = num1 - num2;
			
			//divisão
			double div = num1 / num2;
			
			//multiplicação
			double multi = num1 * num2;
			
			//Saída
			System.out.println("A adição entre os números 1 e 2 é: " + adicao);
			System.out.println("A diferença entre os números 1 e 2 é: " + sub);
			System.out.println("A divisão entre os números 1 e 2 é: " + div);
			System.out.println("A multiplicação entre os números 1 e 2 é: " + multi);
			
			scn.close();
		}

	


	}


