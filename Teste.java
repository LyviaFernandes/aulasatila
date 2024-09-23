package aula09;

import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o nome de usuário: ");
		String user = scn.next();
		
		System.out.println("Digite a senha: ");
		String senha = scn.next();
		
		//senha 
		if (user.equals("SENAI") && senha.equals("senai115")) {
			System.out.println("Parabens, você entrou! :D");
		}
		else
			System.out.println("Usuário e/ou senha inválidos! :(");
		
		scn.close();
		
	}

}
