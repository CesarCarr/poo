import java.util.Scanner;

public class Ex22 {

//	Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as
//	seguintes informações: um valor real indicando posição inicial do móvel P0, um valor real que 
//	corresponde a velocidade do móvel V, um outro valor real A correspondente a aceleração do móvel e
//	um número inteiro correspondente ao tempo decorrido	T. O programa deve calcular a posição final PF do
//		móvel, dado pela relação abaixo: PF = P0 + V * T + (A * T2) / 2

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a posição inicial:");
		double posInicial = Double.parseDouble(sc.nextLine());
		System.out.println("Digite a velocidade:");
		double vel = Double.parseDouble(sc.nextLine());
		System.out.println("Digite a aceleração:");
		double aceleracao = Double.parseDouble(sc.nextLine());
		System.out.println("Digite o tempo decorrido:");
		double tempo = Integer.parseInt(sc.nextLine());
		
		double posFinal = posInicial + (vel * tempo) + (aceleracao * tempo * tempo)/2;
		
		System.out.println("A posicao final do movel é: " + posFinal);

	}

}
