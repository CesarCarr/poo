import java.util.Scanner;

public class converteTempo {
	public static void main(String[] args) {
		int tempo_s;
		double tempo_h;
		
		System.out.print("Digite o tempo em segundos: ");
		Scanner input = new Scanner(System.in);
		tempo_s = input.nextInt();
		if(tempo_s < 0) {
			System.out.println("Digite um valor positivo!");
		} else if(tempo_s == 0) {
			System.out.println("0 segundo(s) = 0 hora(s)");
		}else {
			tempo_h = tempo_s / 3600;
			System.out.println(tempo_s + " segundo(s) = " + tempo_h + " hora(s)");
		}
		input.close();
	}
}