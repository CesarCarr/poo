package ex19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estoque estoque = new Estoque();
		
		while (true) {
			estoque.printaEstoque();
			
			Pedido pedido = new Pedido();
			System.out.println("Quantos itens deseja no seu pedido?");
			int numItens = Integer.parseInt(sc.nextLine());
			ArrayList<Produto> produtos = estoque.getProdutos();
			
			for (int i = 0; i < numItens; i ++) {
				System.out.println("Digite o produto desejado (1 - Feijão/2- Leite/3 - Agua/4 - Oleo/5 - Suco)");
				int op =  Integer.parseInt(sc.nextLine());
				Produto produto;
				switch (op) {
					case 1:
						produto = produtos.get(0);
						break;
					case 2:
						produto = produtos.get(1);
						break;
					case 3:
						produto = produtos.get(2);
						break;
					case 4:
						produto = produtos.get(3);
						break;
					case 5:
						produto = produtos.get(4);
						break;
					default:
						produto = null;
						break;
				}
				
				if (produto != null) {
					System.out.println("Digite a quantidade desejada");
					int quant =  Integer.parseInt(sc.nextLine());
					if (quant > produto.getQntEstoque()) {
						System.out.println("Quantidade invalida.");
					}
					
					Item item = new Item(produto, quant);
					pedido.adicionaItem(item);
				}
			}
			
		}

	}

}
