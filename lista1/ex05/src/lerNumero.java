import java.util.Scanner;

public class lerNumero {
	public static void main(String[] args) {
		System.out.print("Digite o numero inteiro: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num % 2 == 0) {
			System.out.print("O numero eh par");
		}else {
			System.out.print("O numero eh impar");
		}
		input.close();
	}
}