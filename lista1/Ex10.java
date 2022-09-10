import java.util.Scanner;

public class Ex10 {
	
	public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o segundo numero:");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o terceiro numero:");
		int c = Integer.parseInt(sc.nextLine());
		
		int[] vetor = new int[3];
		
		vetor[0] = a;
		vetor[1] = b;
		vetor[2] = c;
		
		bubbleSort(vetor);
		
		System.out.println("Numeros ordenados:");
		for (int n : vetor) {
			System.out.println(n);
		}

	}

}
