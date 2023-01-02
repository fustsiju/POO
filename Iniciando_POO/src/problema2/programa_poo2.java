package problema2;

import java.util.Scanner;
import entities.dados_poo;

public class programa_poo2 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
			
			dados_poo produto;
			produto = new dados_poo();
			
			int r = 0;
			
			do {
				
				System.out.println("MENU DE OPCOES!\n");
				System.out.println("1 - Criar produtos\n");
				System.out.println("2 - Adicionar no estoque\n");
				System.out.println("3 - Remover do estoque\n");
				System.out.println("4 - Imprimir quantidade\n");
				System.out.println("0 - Sair\n");
				r = num.nextInt();
				
			switch(r) {
			case 1:
				
				System.out.println("Insira o nome do produto: \n");
				produto.nome = num.next();
				System.out.println("Insira o preço do produto: \n");
				produto.preco = num.nextDouble();
				System.out.println("Insira a quantidade de produtos: \n");
				produto.quantidade = num.nextInt();			
				
			break;
			
			case 2:	
				char resp;
				do {
					
					System.out.println("Quantidade que deseja adicionar: \n");
					produto.add = num.nextInt();
					produto.AddProducts();
					
					System.out.println("Deseja voltar ao menu inicial? s/n");
					resp = num.next().charAt(0);
				}while(resp == 'n');
				
			break;
			
			case 3:
				do {
					System.out.println("Quantidade que deseja remover: \n");
					produto.rem = num.nextInt();
					produto.RemoveProducts();
					
					System.out.println("Deseja voltar ao menu inicial? s/n");
					resp = num.next().charAt(0);
				}while(resp == 'n');
			break;
			case 4:
				System.out.printf("Nome do produto: %s\n Valor: R$ %.2f\n Valor em estoque: R$ %.2f\n Quantidade em estoque: %d\n", produto.nome, produto.preco, produto.TotalValueInStock(), produto.quantidade);
			
			break;
			case 0:
				
				r = -1;
				
				break;
				
			}
			
			}while(r != -1);
			
			
			num.close();
		}
	}