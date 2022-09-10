import java.util.Scanner;

/* O erro deste código está na potenciação. Como 1 e 2 são inteiros(int), o resultado da divisão será 0,
 * ao invés de 0.5, deixando toda a operação elevada a 0 e, portanto, com resultado 1.
 */

public class Distancia {
	public static void main(String[] args) {
		double x1, y1, x2, y2, distancia;

		System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
		
		Scanner teclado = new Scanner(System.in);
		x1 = teclado.nextDouble();
		teclado = new Scanner(System.in);
		y1 = teclado.nextDouble();
		teclado = new Scanner(System.in);
		x2 = teclado.nextDouble();
		teclado = new Scanner(System.in);
		y2 = teclado.nextDouble();

		distancia = Math.pow((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)), 1/2);
		System.out.println("A distância é: " + distancia);
	}
}
