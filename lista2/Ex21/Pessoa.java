package Ex21;

public class Pessoa {
	private String userName;
	private Emprestimo emprestimo;
	
	public Pessoa(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	

}
