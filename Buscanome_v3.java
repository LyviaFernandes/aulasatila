package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Buscanome_v3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		int digito = 0;
		int quant = 0;
		while (digito != 5) {
		System.out.println("Bem-Vinde ao menu de opções!");
		System.out.println("Digite: \n1 para determinar o n° de elementos \n2 para montar a lista ");
		System.out.println("3 salvar em arquivo txt \n4 para pesquisar o nome na lista \n5 para finalizar");
		digito = scn.nextInt();
		
		switch (digito) {
		case 1: {
			System.out.println("Quantos nomes você deseja adicionar?");
			quant = scn.nextInt();
			scn.nextLine();														
			break;
		}
		
		case 2:  { 
			for(int i = 0; i < quant; i++) {
				System.out.println("Digite o nome " + (i+1) + "° nome: ");
				String nome = scn.next();
				nomes.add(nome);
			}
			
		}																	break;
		case 3: try(PrintWriter writer = new PrintWriter(new FileWriter("Nome.txt"))) {
			for(String nome: nomes) {
				writer.println(nome);
			}
			System.out.println("Nomes salvos com sucesso!!");
		} catch (IOException e) {
			System.out.println("Erro ao salvar nomes!!!" + e.getMessage());
		}																	break;
		case 4: System.out.println("Digite o nome a ser buscado: ");
		String nomeBuscado = scn.next();
		
		boolean encontrado = false;
		int posicao = -1;
		int index = 0;
		
		for(String nome: nomes) {
			if(nome.equalsIgnoreCase(nomeBuscado)) {
				encontrado = true;
				posicao = index;
				break;
			}
			index++;
			
		}
		if(encontrado) {
			System.out.println("Nome encontrado: " +nomes.get(posicao)+ " no indice " + posicao);
		}
		else {
			System.out.println("Nome não encontrado");
		}																		break;
		default : System.out.println("Fim do programa. . .");					break;
		}
		}
	}
}







	
