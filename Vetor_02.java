package loop;

import java.util.*;

public class Vetor_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] nome = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "° nome");
			nome[i] = scn.next();
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("nome [" + (i + 1) + "] =" + nome[i]);
		}
		scn.close();
	}

}
