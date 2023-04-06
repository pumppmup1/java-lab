import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		int findingNumber = scanner.nextInt();
		scanner.close();

		String output = "No";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findingNumber) {
				output = "Yes";
				break;
			}
		}
		System.out.println(output);
	}
}