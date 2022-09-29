import java.util.Scanner;

public class Agenda{
	
	public static void main(String[] args) {
		int i, escolha;
		Scanner input = new Scanner(System.in);
		String nome, endereco, email;
		int fone;
		
		CadastroAgenda cadastro = new CadastroAgenda();
		System.out.print("\nAdicionar: \n1- Pessoa Física;\n2- Pessoa Jurídica;\n\nConsultar:\n3- Pessoa Física;\n4- Pessoa Jurídica;");
		System.out.print("\n\nRemover contato\n5- Pessoa Física;\n6- Pessoa Jurídica;\n\n7- Exibir todos os contatos.\nOutro valor - Sair do programa.\n\n");
		escolha = input.nextInt();
		input.nextLine();
		while(escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4 || escolha == 5 || escolha == 6 || escolha == 7) {
			System.out.print("\nAdicionar: \n1- Pessoa Física;\n2- Pessoa Jurídica;\n\nConsultar:\n3- Pessoa Física;\n4- Pessoa Jurídica;");
			System.out.print("\n\nRemover contato\n5- Pessoa Física;\n6- Pessoa Jurídica;\n\n7- Exibir todos os contatos.\nOutro valor - Sair do programa.\n\n");
			escolha = input.nextInt();
			input.nextLine();
			if(escolha == 1) {
				Fisica cont_fisico;
				Data nascimento;
				nascimento = new Data(1, 2, 3);
				int cpf;
				String civil;
				
				System.out.print("\n\n----Cadastro----\n");
				System.out.print("Digite o nome: ");
				nome = input.nextLine();
				System.out.print("\nDigite o telefone: ");
				fone = input.nextInt();
				System.out.print("\nDigite o endereco: ");
				endereco = input.nextLine();
				System.out.print("\nDigite o email: ");
				email = input.nextLine();
				System.out.print("\nDigite o CPF: ");
				cpf = input.nextInt();
				/*
				System.out.print("\nDigite a Data de nascimento: ");
				data = new Data(cpfCadastro, cpfCadastro, cpfCadastro);
				*/
				System.out.print("\nDigite o estado civil: ");
				civil = input.nextLine();
				cont_fisico = new Fisica(nome, fone, endereco, email, cpf, nascimento, civil);
				cadastro.cadastraContato(cont_fisico);
			}
		
		int quant_cont;
		for(i = 0; i < quant_cont; i++) {
			
		}
		cadastro.printAgenda(cadastro.cadastroAgenda);
	}
}