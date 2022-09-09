import java.util.Scanner;

public class numeroExtenso {
	public static void main(String[] args) {
		double num_user=1, dezena, unidade, decimal=0, decimal_dez=0, decimal_un=0;
		String num_extenso_dez="", num_extenso_un="", num_extenso_dec_dez="", num_extenso_dec_un="";
		
		while(num_user > 0 && num_user <= 100) {
			System.out.println("\nDigite um valor menor ou igual a 0 ou maior que 100 para parar!");
			System.out.println("Digite o numero real: ");
			Scanner input = new Scanner(System.in);
			num_user = input.nextDouble();
			if(num_user < 0 || num_user > 100) {
				System.out.println("\n\n----Encerrando----\n\n");
				System.exit(0);
			}
			
			/*fatoração do número */
			decimal = (num_user % 1)*100;
			decimal = Math.round(decimal);
			decimal = decimal / 100;
			unidade = Math.round(((num_user - decimal) % 10));
			dezena = Math.round(num_user - unidade - decimal);
			
			if(dezena >= 10) {
				num_extenso_dez = tornaExtenso(dezena);
			} 
			if(unidade >= 0 && unidade <= 9) {
				num_extenso_un = tornaExtenso(unidade);
			}
			if(dezena == 10 && unidade >=1 && unidade <= 9) {
				num_extenso_dez = tornaExtenso(dezena + unidade);
			}
			decimal = Math.round(decimal * 100);
			decimal_un = Math.round(decimal % 10);
			decimal_dez = decimal - decimal_un;
			if(decimal_dez >= 10) {
				num_extenso_dec_dez = tornaExtenso(decimal_dez);
			} 
			if(decimal_un >= 0 && decimal_un <= 9) {
				num_extenso_dec_un = tornaExtenso(decimal_un);
			}
			if(decimal_dez == 10 && decimal_un >=1 && decimal_un <= 9) {
				num_extenso_dec_dez = tornaExtenso(decimal_dez + decimal_un);
			}
			
			printaNumero(num_extenso_dez, num_extenso_un, num_extenso_dec_dez, num_extenso_dec_un, 
						  dezena, unidade, decimal_dez, decimal_un);
		}
	}
	
	public static String tornaExtenso(double num) {
		String num_extenso = "";
		
		if(num < 10) {
			if(num == 0) {
				num_extenso = "Zero";
			}
			if(num == 1) {
				num_extenso = "Um";
			}
			if(num == 2) {
				num_extenso = "Dois";
			}
			if(num == 3) {
				num_extenso = "Três";
			}
			if(num == 4) {
				num_extenso = "Quatro";
			}
			if(num == 5) {
				num_extenso = "Cinco";
			}
			if(num == 6) {
				num_extenso = "Seis";
			}
			if(num == 7) {
				num_extenso = "Sete";
			}
			if(num == 8) {
				num_extenso = "Oito";
			}
			if(num == 9) {
				num_extenso = "Nove";
			}
		}
		if(num == 10) {
			num_extenso = "Dez";
		}
		if(num > 10 && num < 20) {
			if(num == 11) {
				num_extenso = "Onze";
			}
			if(num == 12) {
				num_extenso = "Doze";
			}
			if(num == 13) {
				num_extenso = "Treze";
			}
			if(num == 14) {
				num_extenso = "Quatorze";
			}
			if(num == 15) {
				num_extenso = "Quinze";
			}
			if(num == 16) {
				num_extenso = "Dezesseis";
			}
			if(num == 17) {
				num_extenso = "Dezessete";
			}
			if(num == 18) {
				num_extenso = "Dezoito";
			}
			if(num == 19) {
				num_extenso = "Dezenove";
			}
		}
		if(num == 20) {
			num_extenso = "Vinte";
		}
		if(num == 30) {
			num_extenso = "Trinta";
		}
		if(num == 40) {
			num_extenso = "Quarenta";
		}
		if(num == 50) {
			num_extenso = "Cinquenta";
		}
		if(num == 60) {
			num_extenso = "Sessenta";
		}
		if(num == 70) {
			num_extenso = "Setenta";
		}
		if(num == 80) {
			num_extenso = "Oitenta";
		}
		if(num == 90) {
			num_extenso = "Noventa";
		}
		if(num == 100) {
			num_extenso = "Cem";
		}
		return num_extenso;
	}
	public static void printaNumero(String ext_dez, String ext_un, String ext_dec_dez, String ext_dec_un,
									double dezena, double unidade, double dec_dez, double dec_un) {
		
		System.out.println("\n----Valor digitado----\n");
		if((dezena + unidade) > 10 && (dezena + unidade) < 20) {
			System.out.print(ext_dez + " Reais");
		} else if(dezena >= 20 && unidade > 0 ) {
			System.out.print(ext_dez + " e " + ext_un + " Reais");
		} else if(dezena >=10 && unidade ==0) {
			System.out.print(ext_dez + " Reais");
		} else if(dezena == 0 && unidade >= 0 ) {
			System.out.print(ext_un + " Reais");
		}
		
		if((dec_dez + dec_un) > 10 && (dec_dez + dec_un) < 20) {
			System.out.print(" e " + ext_dec_dez + " Centavos. \n");
		} else if(dec_dez >= 20 && dec_un > 0 ) {
			System.out.print(" e " + ext_dec_dez + " e " + ext_dec_un + " Centavos. \n");
		} else if(dec_dez >=10 && dec_un == 0) {
			System.out.print(" e " + ext_dec_dez + " Centavos.\n");
		} else if(dec_dez == 0 && Math.round(dec_un) >= 0 ) {
			System.out.print(" e " + ext_dec_un + " Centavos. \n");
		}
	}
}