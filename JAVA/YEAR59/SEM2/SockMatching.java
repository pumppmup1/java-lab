package JAVA.YEAR59.SEM2;

import java.util.Arrays;
import java.util.Scanner;

public class SockMatching {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        int[] socks = new int[n];

        for (int i = 0; i < n; i++) {
            socks[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(socks);
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (i != n-1) {
                if (socks[i] == socks[i+1]) {
                    counter++;
                    i++;
                }
            }
        }

        System.out.println(counter);
    }
}
