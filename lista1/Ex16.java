import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base:");
		double base = Double.parseDouble(sc.nextLine());
		System.out.println("Digite a altura:");
		double altura = Double.parseDouble(sc.nextLine());
		
		double area = (base * altura) / 2;
		
		System.out.println("A Area do triangulo é " + area);
	}

}
