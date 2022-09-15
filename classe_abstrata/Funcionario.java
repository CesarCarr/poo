package classe_abstrata;

public class Funcionario extends Pessoa {

	protected float salario;
	
	public Funcionario(String nome, Data nascimento, float salario) {
		super(nome, nascimento);
		
		this.salario = salario;
	} 
	
	@Override
	public String imprimeDados() {
		return "O nome do funcionario é " + nome + ", seu salário é " + Float.toString(salario) + " e sua data de nascimento é " + nascimento.getDataNascimento() + "\n"; 
	}
	
	public float calculaImposto() {
		return (float) (salario * 0.03);
	}
}
