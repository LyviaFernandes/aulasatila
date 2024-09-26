package segundalista;

import java.util.Scanner;

public class Ex2_Lyvia {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//variaveis
		int A = 2;
		int B = 3;
		int D = 9;
		
		
		
		//processamento
		if (D > 5) {
		   System.out.println("X = (A + B) * D ou X = (2 + 3) * 9");
		} else {
		System.out.println("X = (A - B) / C ou X = (2 - 3) / 5");
		}
		if (A > 2 && B < 7) {
			   System.out.println("X = (A + 2) * (B - 2) ou X = (2 + 2) * (3 - 2)");
			} else {
			System.out.println("X = (A + B) / D * (C + D) ou X = (2 + 3) / 9 * (5 + 9)");
			}
		if (A >= 2 || B < 7) {
			   System.out.println("X = (A + 2) * (B - 2) ou X = (2 + 2) * (3 - 2)");
			} else {
			System.out.println("X = (A + B) / D * (C + D) ou X = (2 + 3) / 9 * (5 + 9)");
			}
		scn.close();
	}

	}


