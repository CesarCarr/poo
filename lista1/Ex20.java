import java.util.Scanner;

public class Ex20 {

//	Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor
//	dado em pés	(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça 
//	um valor negativo, deve ser exibida	uma mensagem e a operação de conversão não deve ser efetuada. 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		double metros = Double.parseDouble(sc.nextLine());
		
		if (metros >= 0) {
			double pes = metros * 3.315;
			System.out.println("Valor original (metro): " + metros);
			System.out.println("Valor convertido (pés): " + pes);
		}
		else {
			System.out.println("Valor invalido.");
		}

	}

}
