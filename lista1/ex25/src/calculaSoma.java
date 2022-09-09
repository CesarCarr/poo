import java.util.Scanner;

public class calculaSoma {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double num=1, soma=0;
		System.out.println("Digite os valores a serem somados. Digite 0 (zero) para finalizar");
		while(num != 0) {
			System.out.print("Digite o proximo valor: ");
			Scanner input = new Scanner(System.in);
			num = input.nextDouble();
			soma += num;	
		}
		System.out.println("\nO valor da soma eh: " + soma);
	}
}