import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String customerName = scanner.nextLine();
		scanner.close();

		String output = "Welcome " + customerName + " !";
		System.out.println(output);

		System.out.println("Sommai 108 Eleven Shop");
	}
}