import java.util.Scanner;
import java.lang.Math;

public class calculaRaiz{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		
		System.out.print("Digite o valor de a: ");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		System.out.print("Digite o valor de b: ");
		input = new Scanner(System.in);
		b = input.nextDouble();
		System.out.print("Digite o valor de c: ");
		input = new Scanner(System.in);
		c = input.nextDouble();
		System.out.println("\n" + a + "x^2 + " + b + "x + " + c + " = 0");
		
		delta = (b * b) - (4 * a * c);
		System.out.println("\nDelta = " + delta + "\n");
		if(delta < 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		}else {
			x1 = (- b + Math.sqrt(delta)) / 2 * a;
			x2 = (- b - Math.sqrt(delta)) / 2 * a;
			if(delta == 0) {
				System.out.println("Esta equacao possui uma unica raiz");
				System.out.println("X = " + x1);
			}else {
				System.out.println("Esta equacao possui duas raizes");
				System.out.println("X1 = " + x1 + "\nX2 = " + x2);
			}
		}
	}
}