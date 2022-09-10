import java.util.Scanner;

public class ArvoreGenealogica {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa filho = new Pessoa();
		String nome;
		int idade;
		
		System.out.println("\n\n----Pai----\n");
		System.out.print("Digite o nome: ");
		nome = input.nextLine();
		System.out.print("\nDigite a idade: ");
		idade = input.nextInt();
		input.nextLine();
		Pai pai = new Pai(nome, idade);
		
		System.out.println("\n\n----Mae----\n");
		System.out.print("Digite o nome: ");
		nome = input.nextLine();
		System.out.print("\nDigite a idade: ");
		idade = input.nextInt();
		input.nextLine();
		Mae mae = new Mae(nome, idade);
		
		System.out.println("\n\n----Filho----\n");
		System.out.print("Digite o nome: ");
		nome = input.nextLine();
		System.out.print("\nDigite a idade: ");
		idade = input.nextInt();
		input.nextLine();
		filho.setNome(nome);
		filho.setIdade(idade);
		filho.setPai(pai);
		filho.setMae(mae);
		
		System.out.println("\n\n----Filho----\n");
		Pessoa.imprimeArvore(filho);
		System.out.println("\n\n----Mae----\n");
		Pessoa.imprimeArvore(mae);
		System.out.println("\n\n----Pai----\n");
		Pessoa.imprimeArvore(pai);
	}
}