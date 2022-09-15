package classe_abstrata;

public class TestaCadastro {
	
	public static void main(String[] args) {
		Data nascimentoCliente = new Data(01,01,1980);
		Cliente cliente = new Cliente("João da Silva", nascimentoCliente, 10);
		
		Data nascimentoFuncionario = new Data(22,05,1997);
		Funcionario funcionario = new Funcionario("Ana Moreira", nascimentoFuncionario, 2500);
		
		Data nascimentoGerente = new Data(03,12,1992);
		Gerente gerente = new Gerente("Ricardo Almeida", nascimentoGerente, 5000, "Produção");
		
		CadastroPessoas cadastro = new CadastroPessoas();
		
		cadastro.cadastraPessoa(gerente);
		cadastro.cadastraPessoa(funcionario);
		cadastro.cadastraPessoa(cliente);
		

		cadastro.imprimeCadastro(gerente);
		cadastro.imprimeCadastro(funcionario);
		cadastro.imprimeCadastro(cliente);
	}
}
