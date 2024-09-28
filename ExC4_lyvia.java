package testando;

import java.util.Scanner;
public class ExC4_lyvia {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		//Entrada
		System.out.println("Valor da base do triângulo em centímetros: ");
		double base = scn.nextDouble();
		
		System.out.println("Valor do lado direito do triângulo em centímetros: ");
		double dir = scn.nextDouble();
		
		System.out.println("Digite o valor do lado esquerdo do triângulo, em centímetros: ");
		double es = scn.nextDouble();
		
		//determinando o tipo do triângulo
		if (base == dir && base == es) {
			System.out.println("Triângulo equilátero");
			
		} else if (dir == es && dir != base) {
			System.out.println("Triângulo isóceles");
			
		} else if (base != dir && base != es && dir != es) {
			System.out.println("Triângulo escaleno");
			
		}
		
		scn.close();

	}

}
