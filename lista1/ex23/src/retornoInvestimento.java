import java.util.Scanner;
import java.lang.Math;

public class retornoInvestimento {
	public static void main(String[] args) {
		double PV, J, FV;
		int N;
		
		System.out.print("Digite o capital inicial: ");
		Scanner input = new Scanner(System.in);
		PV = input.nextDouble();
		System.out.print("Digite a taxa de juros: ");
		input = new Scanner(System.in);
		J = input.nextDouble();
		System.out.print("Digite o periodo da aplicacao: ");
		input = new Scanner(System.in);
		N = input.nextInt();
		FV = PV * Math.pow((1 + J), N);
		System.out.print("Capital futuro = " + FV);
	}
}