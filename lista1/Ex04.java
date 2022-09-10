import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		double numero = Double.parseDouble(sc.nextLine());
		
		if (numero > 100) {
			System.out.println("O numero é maior que 100.");
		}
		else {
			System.out.println("O numero é menor ou igual a 100.");
		}
	}

	
}
