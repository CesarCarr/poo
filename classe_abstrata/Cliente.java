package classe_abstrata;

public class Cliente extends Pessoa {

	private int codigo;
	
	public Cliente(String nome, Data nascimento, int codigo) {
		super(nome, nascimento);
		
		this.codigo = codigo;
	}

	@Override
	public String imprimeDados() {
		return "O nome do cliente é " + nome + ", seu codigo é " + Integer.toString(codigo) + " e sua data de nascimento é " + nascimento.getDataNascimento() + "\n"; 
	}

}
