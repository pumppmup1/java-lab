import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		if (a > b) {
			System.out.println("A");
		} else if (a < b) {
			System.out.println("B");
		} else {
			System.out.println("AB");
		}
	}
}