import java.util.Scanner;

public class Ex06 {

	public Ex06() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Digite o segundo numero:");
		double b = Double.parseDouble(sc.nextLine());
		
		System.out.println("A é maior que 0?");
		if (a > 0) {
			System.out.println("V");
		}
		else {
			System.out.println("F");
		}
		
		System.out.println("B é maior que 0?");
		if (b > 0) {
			System.out.println("V");
		}
		else {
			System.out.println("F");
		}
		
		System.out.println("A e B são maiores que 0?");
		if (a > 0 && b > 0) {
			System.out.println("V");
		}
		else {
			System.out.println("F");
		}
	}

}
