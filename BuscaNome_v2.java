package vetores;

import java.util.*;

public class BuscaNome_v2 {

	public static void main(String[] args) {
		 
		Scanner scn = new Scanner(System.in);
		
		//vamos declarar  a nossa estrutura arraylist
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
		//vamos solicitar o nome a ser "Buscado/pesquisado" no ArrayList nomes
		System.out.println("Digite o nome a ser buscado: ");
		String nomeBusc = scn.nextLine();
		boolean encontrado = false;
		int posicao = -1;
		int index = 0;
		
		for(String nome: nomes) {
			if(nome.equalsIgnoreCase(nomeBusc)) {
				encontrado = true;
				posicao = index;
				break;
			}
			index++;
		}
		if(encontrado) {
			System.out.println("Nome encontrado: " +nomes.get(posicao)+ "no indice " + posicao);
		}
		else {
			System.out.println("Nome não encontrado");
		}

			
		scn.close();
	}

}
