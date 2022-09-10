import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class doisVetores{
	public static void main(String[] args) {
		int[] vetor1 = new int[50], vetor2 = new int[50], vetorfinal = new int[100];
		int i;
		
		for(i=0; i < 50; i++) {
			vetor1[i] = ThreadLocalRandom.current().nextInt();
			vetor2[i] = ThreadLocalRandom.current().nextInt();
		}
		Arrays.sort(vetor1);
		Arrays.sort(vetor2);
		System.arraycopy(vetor1, 0, vetorfinal, 0, 50);
		System.arraycopy(vetor2, 0, vetorfinal, 50, 50);
		Arrays.sort(vetorfinal);
		System.out.println(Arrays.toString(vetorfinal));
	}
}