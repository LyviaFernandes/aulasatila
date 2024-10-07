package aula11;

import java.util.Scanner;

public class exerx01_while {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int i = 10;
		while( i > 0 ) {
			System.out.println("Numero = " + i);
			i--;
			
		}
		scn.close();
	}
}
