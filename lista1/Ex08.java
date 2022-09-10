import java.util.Scanner;

public class Ex08 {

	public Ex08() {
//		Leia três números inteiros fornecidos pelo usuário. Descubra qual deles é o maior de todos, imprimindo seu valor. 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Digite o segundo numero:");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Digite o terceiro numero:");
		double c = Double.parseDouble(sc.nextLine());
		
		double maior = a;
		
		if (b > maior) {
			maior = b;
		}
		
		if (c > maior) {
			maior = c;
		}
		
		System.out.println("O maior numero é: " + maior);
	}
	
}
