import java.util.Scanner;

public class lerNumero {
	public static void main(String[] args) {
		double A, B;
		
		System.out.print("Digite o primeiro numero: ");
		Scanner inputA = new Scanner(System.in);
		A = inputA.nextDouble();
		System.out.print("Digite o segundo numero: ");
		Scanner inputB = new Scanner(System.in);
		B = inputB.nextDouble();
		inputA.close();
		inputB.close();
		
		System.out.println("A eh igual a zero?");
		if(A == 0) {
			System.out.println("V");
		}else {
			System.out.println("F");
		}
		System.out.println("B eh menor que zero?");
		if(B < 0) {
			System.out.println("V");
		}else {
			System.out.println("F");
		}
		System.out.println("A OU B sao maiores do que zero?");
		if(A > 0 || B > 0) {
			System.out.println("V");
		}else {
			System.out.println("F");
		}
	}
}