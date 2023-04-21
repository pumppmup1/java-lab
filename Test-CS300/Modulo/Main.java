import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int B = scanner.nextInt();
		int n = scanner.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		scanner.close();

		int[] results = new int[n];
		for (int i = 0; i < n; i++) {
			results[i] = array[i] % B;
		}

		Arrays.sort(results);
		int output = 1;
		for (int i = 1; i < n; i++) {
			if (results[i] != results[i - 1]) {
				output++;
			}
		}
		System.out.println(output);
	}
}