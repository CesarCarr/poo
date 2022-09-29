public abstract class Contato {
	protected String nome;
	protected int fone;
	protected String endereco;
	protected String email;

	public Contato(String nome, int fone, String endereco, String email) {
		
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
		this.email = email;
	}
	
	public abstract String imprimeDados();
	public String printContato() {
		return "Nome: " + nome + " Telefone: " + fone + "\n" + "\nEndereço: " + endereco + "\nEmail: " + email;
	}
}