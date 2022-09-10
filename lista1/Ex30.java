import java.util.Scanner;

public class Ex30 {

//	Escreva um programa que calcule o valor de y = f(x) = a*x + b num intervalo de valores de x, 
//	sendo dados pelo usuário os coeficientes a e b, bem como os valores do limite inferior e 
//	superior do intervalo de x bem como o valor do incremento de x. O programa deve exibir 
//	resultados como um tabela onde constam os valores de x e y=f(x) lado a lado. 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente a:");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o coeficiente b:");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o limite superior de x:");
		int limSup = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o limite inferior de x:");
		int limInf = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o incremento de x:");
		int incremento = Integer.parseInt(sc.nextLine());
		
		System.out.println("--------------");
		System.out.println("|  x  | f(x) |");
		System.out.println("--------------");
		for (int x = limInf; x <= limSup; x += incremento) {
			int y = a*x + b;
			System.out.println("|  " + x + "  |  " + y + "  |");
			System.out.println("--------------");
		}

	}

}
