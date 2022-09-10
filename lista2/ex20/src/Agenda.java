import java.util.Scanner;

public class Agenda{
	
	public static void main(String[] args) {
		int i, quant_cont;
		Scanner input = new Scanner(System.in);
		String nomeCadastro, foneCadastro;
		
		CadastroAgenda cadastro = new CadastroAgenda();
		System.out.print("Digite quantos cadastros deseja incluir: ");
		quant_cont = input.nextInt();
		input.nextLine();
		
		for(i = 0; i < quant_cont; i++) {
			System.out.print("\n\n----Cadastro " + (i+1) + "----\n");
			System.out.print("Digite o nome: ");
			nomeCadastro = input.nextLine();
			System.out.print("\nDigite o telefone: ");
			foneCadastro = input.nextLine();
			Contato contato = new Contato(nomeCadastro, foneCadastro);
			cadastro.cadastraContato(contato);
		}
		cadastro.printAgenda(cadastro.cadastroAgenda);
	}
}