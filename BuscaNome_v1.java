//crie um prograa qe armazene nomes em um vertor e permita ao usuario buscar por um nome especifico  
package vetores;

import java.util.Scanner;

public class BuscaNome_v1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		//declarar o vetor de nomes do tipo String
		String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
		
		//vamos solicitar o nome a ser "Buscado/pesquisado" no vetor nomes
		System.out.println("Digite o nome a ser buscado: ");
		String nomeBusc = scn.nextLine();
		
		//vamos declarar uma variavel do tipo booleana (true/false)
		//para indicar se o nome for localizado ou não
		boolean encontrado = false;
		
		//vamos declarar que inicializa a posição como -1 para indicar que o nome(nomeBusc) não foi encontrada
		int posicao = -1;
				
		//vamos declarar uma variavel para "pegar" o indice do nome
		int index = 0;
		
		//vamos executar a busca/pesquisa do nome
		for(String nome: nomes) {
			if(nome.equalsIgnoreCase(nomeBusc)) {
				encontrado = true;
				posicao = index; //armazena a posicao do nome encontrado 
				break; //sai do loop assim que o nome for encontrado
			}
			index++; //incrementa o indice para o proximo elemento
		}
		if(encontrado) {
			System.out.println("Nome encontrado: " +nomes[posicao]+ " no indice " + posicao);
		}
		else {
			System.out.println("Nome não encontrado");
		}
		scn.close();
	}

}
