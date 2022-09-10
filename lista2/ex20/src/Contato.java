public class Contato{
	
	
	private String nome;
	private String fone;

	public Contato(String nome, String fone) {
		
		this.setNome(nome);
		this.setFone(fone);
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String printContato() {
		return "Nome: " + nome + " Telefone: " + fone + "\n";
	}
}