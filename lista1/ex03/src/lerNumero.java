import java.util.Scanner;

public class lerNumero {
	public static void main(String[] args) {
		System.out.print("Digite o numero inteiro: ");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		if(num >= 50) {
			System.out.print("O numero eh maior ou igual a 50");
		}else {
			System.out.print("O numero eh menor que 50");
		}
		reader.close();
	}
}