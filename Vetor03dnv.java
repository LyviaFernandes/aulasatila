package loop;

import java.util.Scanner;

public class Vetor03dnv {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String semaforo[] = {"Vermelho", "Amarelo", "Verde"};
		
		System.out.println("Ordem de um semáforo: \n");
		for(String sinal: semaforo) {
			System.out.printf("%s\n", sinal);
		}
		scn.close();
	}

}
