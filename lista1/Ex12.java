import java.util.Scanner;

public class Ex12 {

	public Ex12() {
//		Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos.
//		O usuário deve fornecer o número de copos a serem comprados e o programa deve calcular o preço total
//		a ser cobrado, exibindo-o.	Observe que: se o número de copo é inferior ou igual a 100, o preço por 
//		copo é R$0.05; se o número de copos está entre 101 e 500, o preço por copo é R$0.04; finalmente se o 
//		número de copos é superior a 500 o preço por copo é R$0.035.
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de copos");
		int numCopos = Integer.parseInt(sc.nextLine());
		double total = 0;
		
		if (numCopos < 1) {
			System.out.println("numero invalido");
		}
		else if (numCopos <= 100) {
			total = numCopos * 0.05;
		}
		else if (numCopos <= 500) {
			total = numCopos * 0.04;
		}
		else {
			total = numCopos * 0.035;
		}
		
		System.out.println("O preço total por " + numCopos + " copos é " + total);

	}

}
