import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		int c = (a * a) + (b * b);
		double temp = Math.sqrt(c);
		c = (int) temp;
		System.out.println(c);
	}
}