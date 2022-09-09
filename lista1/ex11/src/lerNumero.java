import java.util.Scanner;

public class lerNumero {
	public static void main(String[] args) {
		double A, B, C;
		
		System.out.print("Digite o primeiro numero: ");
		Scanner inputA = new Scanner(System.in);
		A = inputA.nextInt();
		System.out.print("Digite o segundo numero: ");
		Scanner inputB = new Scanner(System.in);
		B = inputB.nextInt();
		inputA.close();
		inputB.close();
		
		if(A % B == 0) {
			System.out.println("A eh multiplo de B");
		}else {
			System.out.println("A nao eh multiplo de B");
		}
		if(B % A == 0) {
			System.out.println("B eh multiplo de A");
		}else {
			System.out.println("B nao eh multiplo de A");
		}
	}
}