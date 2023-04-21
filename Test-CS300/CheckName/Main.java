import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();

		int destinyNumber = 0;
		for (int i = 0; i < name.length(); i++) {
			char eachCharacter = name.charAt(i);
			if (eachCharacter == 'A' || eachCharacter == 'J' || eachCharacter == 'S') {
				destinyNumber += 1;
			} else if (eachCharacter == 'B' || eachCharacter == 'K' || eachCharacter == 'T') {
				destinyNumber += 2;
			} else if (eachCharacter == 'C' || eachCharacter == 'L' || eachCharacter == 'U') {
				destinyNumber += 3;
			} else if (eachCharacter == 'D' || eachCharacter == 'M' || eachCharacter == 'V') {
				destinyNumber += 4;
			} else if (eachCharacter == 'E' || eachCharacter == 'N' || eachCharacter == 'W') {
				destinyNumber += 5;
			} else if (eachCharacter == 'F' || eachCharacter == 'O' || eachCharacter == 'X') {
				destinyNumber += 6;
			} else if (eachCharacter == 'G' || eachCharacter == 'P' || eachCharacter == 'Y') {
				destinyNumber += 7;
			} else if (eachCharacter == 'H' || eachCharacter == 'Q' || eachCharacter == 'Z') {
				destinyNumber += 8;
			} else if (eachCharacter == 'I' || eachCharacter == 'R') {
				destinyNumber += 9;
			}
		}

		int sum = 0;
		// add while loop
		if (destinyNumber < 10) {
			sum = destinyNumber;
		} else if (destinyNumber < 100) {
			sum = (destinyNumber / 10) + (destinyNumber % 10);
		} else {
			sum = (destinyNumber / 100) + ((destinyNumber % 100) / 10) + (destinyNumber % 10);
		}

		if (sum % 2 == 0) {
			System.out.println("Your destiny number is " + sum + " and it is lucky.");
		} else {
			System.out.println("Your soul number is " + sum + " and it is unlucky.");
		}

		// Soul Number
		int soulNumber = 0;
		for (int i = 0; i < name.length(); i++) {
			char eachCharacter = name.charAt(i);
			if (eachCharacter == 'A') {
				soulNumber += 1;
			} else if (eachCharacter == 'U') {
				soulNumber += 3;
			} else if (eachCharacter == 'E') {
				soulNumber += 5;
			} else if (eachCharacter == 'O') {
				soulNumber += 6;
			} else if (eachCharacter == 'I') {
				soulNumber += 9;
			}
		}

		if (soulNumber >= 20) {
			System.out.println("Your soul number is " + soulNumber + " and it is high.");
		} else if (soulNumber >= 11) {
			System.out.println("Your soul number is " + soulNumber + " and it is average.");
		} else {
			System.out.println("Your soul number is " + soulNumber + " and it is low.");
		}
	}
}