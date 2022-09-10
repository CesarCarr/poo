import java.util.Scanner;

public class Ex14 {

	public Ex14() {
//		Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética.
//		Imprima também "Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" 
//		se estiver entre 3 e 7. 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Digite a segunda nota:");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Digite a terceira nota:");
		double c = Double.parseDouble(sc.nextLine());
		
		double media = (a + b + c)/3;
		
		System.out.println("A media é " + media);
		
		if (media > 7) {
			System.out.println("Aprovado");
		}
		else if (media >= 3) {
			System.out.println("Exame");
		}
		else {
			System.out.println("Reprovado");
		}

	}

}
