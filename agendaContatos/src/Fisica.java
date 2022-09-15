public class Fisica extends Contato {
	private int cpf;
	private Data nascimento;
	private String civil;
	
	public Fisica(String nome, String fone, String endereco, String email, int cpf, Data nascimento, String civil) {
		super(nome, fone, endereco, email);
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.civil = civil;
	}
	
	@Override
	public String imprimeDados() {
		return "\nCPF: " + cpf + "\nNome: " + nome + "\nNascimento: " + nascimento.getDataNascimento() + "\nEstado civil: " + civil + "\nTelefone: " + fone + "\nEndereço: " + endereco + "\nEmail: " + email + "\n";
	}
}