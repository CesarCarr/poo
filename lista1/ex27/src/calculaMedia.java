import java.util.Scanner;

public class calculaMedia {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double nota=0, soma=0;
		int n_nota=0;
		
		System.out.println("Digite as notas do aluno.\nDigite um valor negativo para finalizar.\n");
		while(nota >= 0) {
			soma += nota;
			n_nota++;
			System.out.print("Digite a nota " + n_nota + ": ");
			Scanner input = new Scanner(System.in);
			nota = input.nextDouble();
		}
		System.out.println("\nA media do aluno eh: " + (soma/(n_nota-1)));
	}
}