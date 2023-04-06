import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		scanner.close();

		int add = input1 + input2;
		int subtract = input1 - input2;
		int multiply = input1 * input2;
		int divide = input1 / input2;

		String output1 = input1 + " + " + input2 + " = " + add;
		String output2 = input1 + " - " + input2 + " = " + subtract;
		String output3 = input1 + " * " + input2 + " = " + multiply;
		String output4 = input1 + " / " + input2 + " = " + divide;

		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		System.out.println(output4);
	}
}