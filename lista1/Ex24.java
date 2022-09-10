import java.util.Scanner;

public class Ex24 {

	public Ex24() {
//		Implementar três programas para exibir a tabuada de um número inteiro entre 1 e 20 dado pelo usuário.
//		a) Usando enquanto (while)
//		b) Usando faça-enquanto (do-while)
//		c) Usando para (for)
//		 Obs. Caso o valor dado seja inválido o programa deve apenas exibir uma mensagem de aviso. 
	}
	
	public static void tabuadaWhile(int numero) {
		System.out.println("Tabuada While");
		int i = 1;
		while (i <= 10) {
			System.out.println(numero + " * " + i + ": " + numero * i);
			i++;
		}
		System.out.println("---------------");
	}
	
	public static void tabuadaFor(int numero) {
		System.out.println("Tabuada For");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " * " + i + ": " + numero * i);
		}
		System.out.println("---------------");
	}
	
	public static void tabuadaDoWhile(int numero) {
		System.out.println("Tabuada Do While");
		int i = 1;
		do {
			System.out.println(numero + " * " + i + ": " + numero * i);
			i++;
		} while (i <= 10);
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero para tabuada:");
		int numero = Integer.parseInt(sc.nextLine());
		
		while (numero < 1 || numero > 20) {
			System.out.println("Numero invalido. Tente outro");
			numero = Integer.parseInt(sc.nextLine());
		}
		
		tabuadaWhile(numero);
		tabuadaFor(numero);
		tabuadaDoWhile(numero);
		
	}

}
