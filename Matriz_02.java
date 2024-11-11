package matrizes;

import java.util.Scanner;

public class Matriz_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int[][] matriza = new int[3][3];
		
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("Digite um valor inteiro: ");
				matriza[lin][col] = scn.nextInt();

	}
		}
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 3; col++) {
				if(lin==0 && col==2 || lin==1 && col==1 || lin==2 && col==0) {
					System.out.println(matriza[lin][col]);
					
				}
			}
		}

	}

}
