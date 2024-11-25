package trabalhoatila;

import java.io.*;
import java.util.*;

public class Naoqueromais {
	
	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        String caminhoArquivo = "C:\\Users\\1DT\\Documents\\LOG_TurmaA\\Equipe_Venus\\produtos1.csv"; // mudar no código final
	        String[][] conteudo = new String[11][4]; // armazena o conteúdo
	        int pag = 0;
	        int din = 0;
	        int quant = 0;
	        double valorTotal;
	
	        do {
	        System.out.println("....Máquina de Vendas....\n");

	        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
	            String coluna;

	            // lê as colunas 1 e 2 do arquivo
	            int linha = 0;
	            while ((coluna = br.readLine()) != null) {
	                conteudo[linha] = coluna.split(";");
	                System.out.println(conteudo[linha][0] + "\t" + conteudo[linha][1]);
	                linha++;
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	        int pedido;
	        
	        do {
	        //impossibilita o usuário de inserir um codigo de produto que não existe
	        System.out.println("\nInsira o código do produto de sua escolha: ");
	        pedido = scn.nextInt();
	            if (pedido <= 0 || pedido > 10) {
	                System.out.println("CÓDIGO INVÁLIDO, DIGITE NOVAMENTE");
	            }
	        } while (pedido <= 0 || pedido > 10);

	        //impossibilita o usuário de inserir uma quantidade inválida ou que a máquina não possua
	        int quantidade;
	        int unidade;
	        double precoUnitario = Double.parseDouble(conteudo[pedido][2]);
	        do {
	            quantidade = Integer.parseInt(conteudo[pedido][3].trim());
	            System.out.println("\nExistem "+quantidade+" unidades desse produto e o preço unitário é de R$ "+precoUnitario+
	                               ", insira a quantidade desejada:");
	            unidade = scn.nextInt();
	            if(unidade<=0||unidade>quantidade)System.out.println("\nQuantidade selecionada inválida, digite novamente");
	        } while(unidade<=0||unidade>quantidade);
	        
	         valorTotal = precoUnitario * unidade;
	        System.out.println("\nValor total: R$"+valorTotal);
	        System.out.println("\nInsira o método de pagamento:\n1-Dinheiro\n2-Débito\n3-Crédito\n4-Pix\n5-Cancelar");
	        pag = scn.nextInt();
	        
	       
	        switch (pag) {
	        case 1: System.out.println("Escolha o valor da nota para o pagamento: \n2-R$2,00 \n5-R$5,00 \n10-R$10,00 \n20-R$20,00 "
	        		+ "\n50-R$50,00 \n100-R$100,00 \ntroco máximo R$50,00!");
	        din = scn.nextInt();
	        System.out.println("Insira a quantidade de cédulas");
	        quant = scn.nextInt();
	        double troco = (din * quant) - valorTotal; 
	        switch (din) {
	        case 2: if(din * quant < valorTotal) {
	        	System.out.println("Créditos insuficientes");
	        } else if (din * quant == valorTotal) {
	        	System.out.println("Compra realizada com sucesso!");
	        } else
	        	System.out.println("Seu troco é: R$" + troco);
	        break;
	        case 5: if(din * quant < valorTotal) {
	        	System.out.println("Créditos insuficientes");
	        } else if (din * quant == valorTotal) {
	        	System.out.println("Compra realizada com sucesso!");
	        } else 
	        	System.out.println("Seu troco é: R$" + troco);
	        break;
	        case 10: if(din * quant < valorTotal) {
	        	System.out.println("Créditos insuficientes");
	        } else if (din * quant == valorTotal) {
	        	System.out.println("Compra realizada com sucesso!");
	        } else 
	        	System.out.println("Seu troco é: R$" + troco);
	        break;
	        case 20: if(din * quant < valorTotal) {
	        	System.out.println("Créditos insuficientes");
	        } else if (din * quant == valorTotal) {
	        	System.out.println("Compra realizada com sucesso!");
	        } else 
	        	System.out.println("Seu troco é: R$" + troco); 
	        break;
	        case 50: if(din * quant < valorTotal) {
	        	System.out.println("Créditos insuficientes");
	        } else if (din * quant == valorTotal) {
	        	System.out.println("Compra realizada com sucesso!");
	        } else 
	        	System.out.println("Seu troco é: R$" + troco); 
	        break;
	        case 100: if(din * quant < valorTotal) {
	        	System.out.println("Créditos insuficientes");
	        } else if (din * quant == valorTotal) {
	        	System.out.println("Compra realizada com sucesso!");
	        } else 
	        	System.out.println("Seu troco é: R$" + troco);
	        break;
	        
	        } break;
	        case 2: System.out.println("Insira ou aproxime seu cartão na máquina."); break;
	        case 3: System.out.println("Insira ou aproxime seu cartão na máquina."); break;
	        case 4: System.out.println("Scaneie o QrCode na máquina e realize o pagamento."); break;
	        case 5: System.out.println("Compra cancelada com sucesso!"); break;
	        default: System.out.println("Número selecionado é inválido"); break;
	        }
	        } while(pag >= 2 && pag <= 5 || din * quant == valorTotal);
	        
	        
	        scn.close();
	    }

	}