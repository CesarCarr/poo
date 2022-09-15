public class Juridica extends Contato {
	private int cnpj;
	private int insc_estadual;
	private String raz_social;
	
	public Juridica(String nome, String fone, String endereco, String email, int cnpj, int insc_estadual, String raz_social) {
		super(nome, fone, endereco, email);
		this.cnpj = cnpj;
		this.insc_estadual = insc_estadual;
		this.raz_social = raz_social;
	}
	
	@Override
	public String imprimeDados() {
		return "\nCNPJ: " + cnpj + "\nRazão Social: " + raz_social + "\nInscrição Estadual: " + insc_estadual + "\nNome: " + nome + "\nTelefone: " + fone + "\nEndereço: " + endereco + "\nEmail: " + email + "\n";
	}
}