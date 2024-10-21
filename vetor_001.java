package loop;

import java.util.*;


public class vetor_001 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] num = new int [5];
		
		
		//entrada + processamento
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o "  + (i + 1) + "º número: ");
			num[i] = scn.nextInt();
		}
		
		System.out.println("elementos/vetor");
		for(int i = 0; i <  5; i++) {
			System.out.println("Num[" + (i + 1) + "] = " + num[i]);
		}
		scn.close();
	
	}

}
