import java.util.Scanner;

public class Ex02 {

	public Ex02() {
//		Escreva um programa que leia um número real fornecido pelo usuário, armazenando-o numa variável
//		apropriada. Imprima o valor lido
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		double numero = Double.parseDouble(sc.nextLine());
		
		System.out.println("Numero: " + numero);

	}

}
