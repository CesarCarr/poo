package classe_abstrata;

public class Gerente extends Funcionario {

	private String area;
	
	public Gerente(String nome, Data nascimento, float salario, String area) {
		super(nome, nascimento, salario);
		
		this.area = area;
	}
	
	public float calculaImposto() {
		return (float) (salario * 0.05);
	}
	
	@Override
	public String imprimeDados() {
		return "O nome do gerente é " + nome + ", seu salário é " + Float.toString(salario) + " sua data de nascimento é " + nascimento.getDataNascimento() + "e sua área de atuação é " + area + "\n"; 
	}
}
