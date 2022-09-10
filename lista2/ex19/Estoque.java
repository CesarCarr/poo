package ex19;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produto> produtos;

	public Estoque() {
		produtos.add(new Produto("Feijão", 5.0, 100));
		produtos.add(new Produto("Leite", 3.0, 100));
		produtos.add(new Produto("Agua", 2.0, 50));
		produtos.add(new Produto("Oleo", 5.5, 70));
		produtos.add(new Produto("Suco", 4.5, 80));
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public void printaEstoque() {
		for (Produto p : produtos) {
			System.out.println("Produto: " + p.getNome());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("Estoque: " + p.getQntEstoque());
			System.out.println("-----------------------------------");
		}
	}

}
