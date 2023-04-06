import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		int power = scanner.nextInt();
		scanner.close();

		int result = 1;
		for (int i = 0; i < power; i++) {
			result = result * base;
		}
		System.out.println(result);
	}
}