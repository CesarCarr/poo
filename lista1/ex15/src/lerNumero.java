import java.util.Scanner;

public class lerNumero {
	public static void main(String[] args) {
		int x, y;
		
		System.out.print("Digite o primeiro numero: ");
		Scanner inputA = new Scanner(System.in);
		x = inputA.nextInt();
		System.out.print("Digite o segundo numero: ");
		Scanner inputB = new Scanner(System.in);
		y = inputB.nextInt();
		inputA.close();
		inputB.close();
		System.out.println( x + " + " + y + " = " + (x + y));
		System.out.println( x + " * " + y + " = " + (x * y));
		if(x == y) {
			System.out.println( x + " == " + y);
		}else if( x > y){
			System.out.println( x + " > " + y);
		}else {
			System.out.println( x + " < " + y);
		}
	}
}