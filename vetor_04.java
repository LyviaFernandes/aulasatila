package loop;

import java.util.Scanner;

public class vetor_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] vetora = new int[5];
		int[] vetorb = new int[5];
		int[] vetorc = new int[5];
		
		for (int i = 0; i < 5;i++) {
			System.out.println("Digite um valor: ");
			vetora[i] = scn.nextInt();
			vetorb[i] = vetora[i] * 3;
			vetorc[i] = vetora[i] - vetorb[i];
			
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("vertorc[" + (i+1) + "]=" + vetorc[i]);
		}
		
		scn.close();
		
	}

}
