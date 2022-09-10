public class Pessoa{
	String nome;
	int idade;
	Pessoa Pai;
	Pessoa Mae;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome(String nome) {
		return nome;
	}
	void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade(int idade) {
		return idade;
	}
	void setPai(Pessoa pai) {
		this.Pai = pai;
	}
	void getPai(Pessoa pai) {
		this.Pai = pai;
	}
	void setMae(Pessoa mae) {
		this.Mae = mae;
	}
	void getMae(Pessoa mae) {
		this.Mae = mae;
	}
	public static void imprimeArvore(Pessoa pessoa) {
		System.out.println("Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade);
	}
}