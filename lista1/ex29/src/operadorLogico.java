import java.util.Scanner;

public class operadorLogico{
	public static void main(String[] args) {
		boolean A=true, B=true, C=true, check;
		int escolha=2;
		
		while(escolha != 1 && escolha != 0) {
			System.out.println("Digite 1 para true e 0 para false!");
			System.out.print("A = ");
			Scanner input = new Scanner(System.in);
			escolha = input.nextInt();
			if(escolha == 1) {
				A = true;
			}
			if(escolha == 0) {
				A = false;
			}
		}
		escolha = 2;
		while(escolha != 1 && escolha != 0) {
			System.out.println("Digite 1 para true e 0 para false!");
			System.out.print("B = ");
			Scanner input = new Scanner(System.in);
			escolha = input.nextInt();
			if(escolha == 1) {
				B = true;
			}
			if(escolha == 0) {
				B = false;
			}
		}
		escolha = 2;
		while(escolha != 1 && escolha != 0) {
			System.out.println("Digite 1 para true e 0 para false!");
			System.out.print("C = ");
			Scanner input = new Scanner(System.in);
			escolha = input.nextInt();
			if(escolha == 1) {
				C = true;
			}
			if(escolha == 0) {
				C = false;
			}
		}
		check = A && B && C;
		if(check == true) {
			System.out.print("\nA && B && C = V");
		}else {
			System.out.print("\nA && B && C = F");
		}
	}
}