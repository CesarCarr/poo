import java.util.ArrayList;

public class CadastroAgenda {
	public int qtdCont = 0;
	public ArrayList<Contato> cadastroContatos = new ArrayList<Contato>();
	
	public void cadastraContato(Contato contato) {
		cadastroContatos.add(contato);
		qtdCont++;
	}
	
	public void imprimeCadastro(Contato contato) {
		System.out.print(contato.imprimeDados());
	}
}