package Ex23;

import java.util.Scanner;

public class Main {
	
//	Faça	 um	 programa	 que	 calcule	 a	 área	 de	 uma	 figura	 geométrica.
//	Aceite	 quatro	 tipos	 de	 figura	geométrica:	quadrado,	retângulo,	triângulo	e	círculo.
//	Use	herança	e	polimorfismo.
	
	private static void imprimeArea(FiguraGeometrica f) {
        System.out.println("Área da figura: " + f.calculaArea());
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FiguraGeometrica figura = null;
		
		System.out.println("Escolha a figura para calcular a area:");
		System.out.println("1 - Quadrado, 2 - Retangulo, 3 - Circulo, 4 - Triangulo");
		
		int op = Integer.parseInt(sc.nextLine());
		
		switch(op) {
			case 1:
				System.out.println("Digite o lado do quadrado:");
				double lado = Double.parseDouble(sc.nextLine());
				figura = new Quadrado(lado);
				break;
			case 2:
				System.out.println("Digite a base do retangulo:");
				double baseR = Double.parseDouble(sc.nextLine());
				System.out.println("Digite a altura do retangulo:");
				double alturaR = Double.parseDouble(sc.nextLine());
				figura = new Retangulo(baseR, alturaR);
				break;
			case 3:
				System.out.println("Digite a base do circulo:");
				double raio = Double.parseDouble(sc.nextLine());
				figura = new Circulo(raio);
				break;
			case 4:
				System.out.println("Digite a base do triangulo:");
				double baseT = Double.parseDouble(sc.nextLine());
				System.out.println("Digite a altura do retangulo:");
				double alturaT = Double.parseDouble(sc.nextLine());
				figura = new Triangulo(baseT, alturaT);
				break;
		}
		
		if (figura != null) {
			imprimeArea(figura);
		}
	}
}
