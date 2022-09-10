import java.util.Scanner;

public class Ex10 {
	
	public static double calculaInvestimento(double quantiaMensal, double juros, double saldo) {
		
		for (int i = 0; i < 12; i++) {
			saldo = (quantiaMensal + saldo) * (1 + juros/100);
		}
		
		return saldo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de dinheiro a ser investida por mês:");
		double dinheiro = Double.parseDouble(sc.nextLine());
		
		System.out.println("Informe a taxa de juros:");
		double juros = Double.parseDouble(sc.nextLine());
		
		double saldo = calculaInvestimento(dinheiro, juros, 0);
		System.out.println("Saldo do investimento após 1 ano: " + saldo);
		
		System.out.println("Deseja processar mais um ano? (S/N)");
		String resp = sc.nextLine();
		
		while (!resp.equals("N")) {
			saldo = calculaInvestimento(dinheiro, juros, saldo);
			System.out.println("Saldo do investimento após 1 ano: " + saldo);
			
			System.out.println("Deseja processar mais um ano? (S/N)");
			resp = sc.nextLine();
		}		

	}

}
