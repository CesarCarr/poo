package Ex21;

import java.util.ArrayList;

public class Emprestimo {
	private ArrayList<Livro> livros;
	private int dias;

	public Emprestimo() {
		this.livros = new ArrayList<Livro>();
		this.dias = 7;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	public void adicionaLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public void printaEmprestimo() {
		for (Livro livro : livros) {
			System.out.println("Nome: " + livro.getNome());
		}
		System.out.println("Dias: " + this.dias);
	}
	
	

}
