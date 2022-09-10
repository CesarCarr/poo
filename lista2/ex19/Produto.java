package ex19;

public class Produto {
	private String nome;
	private double preco;
	private int qntEstoque;
	
	public Produto(String nome, double preco, int qntEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}
	
	

}
