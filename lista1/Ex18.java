import java.util.Scanner;

public class Ex18 {

//	Escreva um programa que leia um número inteiro entre 0 e 100 e o exiba por extenso, por exemplos: 
//	16 -> "dezesseis", 34 -> "trinta e quatro", etc..

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		int numero = Integer.parseInt(sc.nextLine());
		
		int decimal = numero / 10;
		String decimalExtenso = "";
		System.out.println(decimal);
		
		switch (decimal) {
			case 9:
				decimalExtenso = "Noventa";
				break;
			case 8:
				decimalExtenso = "Oitenta";
				break;
			case 7:
				decimalExtenso = "Setenta";
				break;
			case 6:
				decimalExtenso = "Sessenta";
				break;
			case 5:
				decimalExtenso = "Cinquenta";
				break;
			case 4:
				decimalExtenso = "Quarenta";
				break;
			case 3:
				decimalExtenso = "Trinta";
				break;
			case 2:
				decimalExtenso = "Vinte";
				break;
			case 1:
				decimalExtenso = "";
				break;
		}
		
		int unidade = numero % 10;
		String unidadeExtenso = "";
		
		if (numero >= 10 && numero < 20) {
			switch (unidade) {
				case 9:
					unidadeExtenso = "Dezenove";
					break;
				case 8:
					unidadeExtenso = "Dezoito";
					break;
				case 7:
					unidadeExtenso = "Dezessete";
					break;
				case 6:
					unidadeExtenso = "Dezesseis";
					break;
				case 5:
					unidadeExtenso = "Quinze";
					break;
				case 4:
					unidadeExtenso = "Catorze";
					break;
				case 3:
					unidadeExtenso = "Treze";
					break;
				case 2:
					unidadeExtenso = "Doze";
					break;
				case 1:
					unidadeExtenso = "Onze";
					break;
				case 0:
					unidadeExtenso = "Dez";
					break;
			}
		}
		else {
			switch (unidade) {
				case 9:
					unidadeExtenso = "Nove";
					break;
				case 8:
					unidadeExtenso = "Oito";
					break;
				case 7:
					unidadeExtenso = "Sete";
					break;
				case 6:
					unidadeExtenso = "Seis";
					break;
				case 5:
					unidadeExtenso = "Cinco";
					break;
				case 4:
					unidadeExtenso = "Quatro";
					break;
				case 3:
					unidadeExtenso = "Três";
					break;
				case 2:
					unidadeExtenso = "Dois";
					break;
				case 1:
					unidadeExtenso = "Um";
					break;
				case 0:
					unidadeExtenso = "";
					break;
			}
		}
		
		if (decimalExtenso.equals("")) {
			System.out.println("Numero " + numero + ": " + unidadeExtenso);
		}
		else if (unidadeExtenso.equals("")) {
			System.out.println("Numero " + numero + ": " + decimalExtenso);
		}
		else {
			System.out.println("Numero " + numero + ": " + decimalExtenso + " e " + unidadeExtenso);
		}

	}

}
