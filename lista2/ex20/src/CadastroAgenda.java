import java.util.ArrayList;

public class CadastroAgenda {
	public int n_contatos = 0;
	public ArrayList<Contato> cadastroAgenda = new ArrayList<Contato>();
	Contato cadastro;
	
	public void cadastraContato(Contato contato) {
		cadastroAgenda.add(contato);
		n_contatos++;
	}
	
	public void printAgenda(ArrayList<Contato> cadastroAgenda) {
		int i;
		
		for(i = 0; i < cadastroAgenda.size() ; i++) {
			cadastro = cadastroAgenda.get(i);
			System.out.print("\n\n----Contato " + (i+1) + "----\n");
			System.out.print(cadastro.printContato());
		}
	}
}