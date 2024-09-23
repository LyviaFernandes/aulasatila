package segundalista;

import java.util.Scanner;
import java.util.Locale;
public class ExC2_lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		scn.useLocale(Locale.US);
		int money;
		
		
		System.out.println("Digite um valor em Reais: ");
		double reais = scn.nextDouble();
		
		System.out.println("Digite a conversão desejada");
		System.out.println("\n1 para Dolar \n2 para Euro \n3 para libra \n4 para Peso");
		money = scn.nextInt();
		
		//processamento
		double dolar = reais / 5.43;
		double euro = reais / 6.05;
		double libra = reais / 7.20;
		double pesoarg = reais * 0.0056;
		
		//saida
		switch (money) {
		case 	1: System.out.println("Reais em Dólar: " + dolar);				break;
		case 	2: System.out.println("Reais em Euro: " + euro); 				break;
		case 	3: System.out.println("Reais em Libra: " + libra); 				break;
		case 	4: System.out.println("Reais em Peso argentino: " + pesoarg); 	break;
		default  : System.out.println("Inválido"); 								break;
		}
		scn.close();

	}

}
