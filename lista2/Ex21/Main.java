package Ex21;

import java.util.Scanner;

public class Main {

//	Faça	 um	 programa	 para	 controle	 de	 empréstimo	 de	 livros,	 
//	com	 as	 classes Emprestimo, Livro e	Pessoa

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite seu nome de usuário:");
			String userName = sc.nextLine();
			Pessoa pessoa = new Pessoa(userName);
			Emprestimo emprestimo = new Emprestimo();
			
			System.out.println("Digite o nome do livro que deseja alugar ou digite exit para sair:");
			String nome = sc.nextLine();
			if (nome.equals("exit")) {
				break;
			}
			else {
				while (!nome.equals("exit")) {
					Livro livro = new Livro(nome);
					emprestimo.adicionaLivro(livro);
				}
				System.out.println("Insira o periodo de emprestimo, ou aperte enter para obter o periodo padrão.");
				String periodo = sc.nextLine();
				if (!periodo.equals("")) {
					emprestimo.setDias(Integer.parseInt(periodo));
				}
			}
			
			emprestimo.printaEmprestimo();
		}

	}

}
