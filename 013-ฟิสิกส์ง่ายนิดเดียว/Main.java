import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int distance = scanner.nextInt();
		int time = scanner.nextInt();
		scanner.close();

		int velocity = distance / time;

		String output = velocity + " km/h";
		System.out.println(output);
	}
}