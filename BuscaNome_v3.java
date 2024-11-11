package vetores;

import java.util.*;
import java.io.*; // i = input  o = output
public class BuscaNome_v3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		
		System.out.println("Quantos nomes você deseja adicionar?");
		int quantidade = scn.nextInt();
		scn.nextLine();
		
		//vamos solicitar ao usuario os nomes
		for(int i = 0; i < quantidade; i++) {
		System.out.println("Digite o nome " + (i+1) + "° nome: ");
		String nome = scn.nextLine();
		nomes.add(nome);
	}
		//salvar os nomes em um arquivo chamado nomes.txt
		try(PrintWriter writer = new PrintWriter(new FileWriter("Nome.txt"))) {
			for(String nome: nomes) {
				writer.println(nome);
			}
			System.out.println("Nomes salvos com sucesso!!");
		} catch (IOException e) {
			System.out.println("Erro ao salvar nomes!!!" + e.getMessage());
		}
		System.out.println("Digite o nome a ser buscado: ");
		String nomeBuscado = scn.nextLine();
		
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
		}
		scn.close();
	}

}
