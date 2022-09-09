import java.util.Scanner;

public class lerNumero {
	public static void main(String[] args) {
		double A, B, C, win=0;
		
		System.out.println("Digite o primeiro numero: ");
		Scanner inputA = new Scanner(System.in);
		A = inputA.nextDouble();
		System.out.println("Digite o segundo numero: ");
		Scanner inputB = new Scanner(System.in);
		B = inputB.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		Scanner inputC = new Scanner(System.in);
		C = inputC.nextDouble();
		inputA.close();
		inputB.close();
		inputC.close();
		if ((((B - C) < A) & (A < B + C)) & (((A - C) < B) & (B < A + C)) & (((A - B) < C) & (C < A + B))) {
			if(A == B && A == C && B == C) {
				System.out.println("Eh um triangulo equilatero!");
			}else if(A != B && A != C && B != C){
				System.out.println("Eh um triangulo escaleno!");
			}else {
				System.out.println("Eh um triangulo isosceles!");
			}
		}else {
			System.out.println("Nao eh triangulo");
		}
	}
}