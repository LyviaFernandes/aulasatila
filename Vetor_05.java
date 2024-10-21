package loop;

import java.util.Scanner;

public class Vetor_05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] vetora = new int[5];
		int[] vetorb = new int[5];
		
		for (int i = 0; i < 5;i++) {
			System.out.println("Digite um valor: ");
			vetora[i] = scn.nextInt();
			vetorb[i] = (int) Math.pow(vetora[i], 2);
			
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("vertora[" + (i+1) + "]=" + vetora[i] +"    " +
					"vertorb[" + (i+1) + "]=" + vetorb[i]);
		}
		
		scn.close();
		
	}

}
