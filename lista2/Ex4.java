import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("Informe o produto desejado:");
			System.out.println("1 - Leite (R$ 3,00)");
			System.out.println("2 - Arroz (R$ 4,00)");
			System.out.println("3 - Feijão (R$ 5,00)");
			
			Scanner sc = new Scanner(System.in);
			
			int produto = Integer.parseInt(sc.nextLine());
			int preco = 0;
			
			if (produto == 1) {
				preco = 3;
			}
			else if (produto == 2) {
				preco = 4;
			}
			else if (produto == 3) {
				preco = 5;
			}
			else {
				System.out.println("Produto invalido.");
				break;
			}
			
			System.out.println("Informe a quantidade desejada:");
			
			int quant = Integer.parseInt(sc.nextLine());
			double total = 0;
			
			if (quant <= 0) {
				System.out.println("Quantidade invalida.");
				break;
			}
			if (quant <= 10) {
				total = preco * quant;
			}
			if (quant <= 20) {
				total = preco * quant * 0.9;
			}
			else if (quant <= 50) {
				total = preco * quant * 0.8;
			}
			else if (quant > 50) {
				total = preco * quant * 0.75;
			}
			
			System.out.println("O total a ser pago é " + total + " R$.");
		}
	}

}
