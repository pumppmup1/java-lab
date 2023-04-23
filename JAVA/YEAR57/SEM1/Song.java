package JAVA.YEAR57.SEM1;

import java.util.Arrays;
import java.util.Scanner;

public class Song {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        int[] songId = new int[n];
        int[] songGenre = new int[n];
        
        for (int i = 0; i < n; i++) {
            songId[i] = scanner.nextInt();
            songGenre[i] = scanner.nextInt(); 
        }
		scanner.close();

        // Calculate Point
        int[] points = new int[] {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            int thisSongGenre = songGenre[i];
            int indexOfPoint = thisSongGenre - 1;
            points[indexOfPoint]++;
        }

        // Find Top 2
        int[] tmpPoints = new int[6];
        for (int i = 0; i < 6; i++) {
            tmpPoints[i] = points[i];
        }

        Arrays.sort(tmpPoints);
        int topPoint1 = tmpPoints[0];
        int topPoint2 = tmpPoints[1];

        int songGenre1 = 0;
        int songGenre2 = 0;
        for (int i = 0; i < 6; i++) {
            if (points[i] == topPoint1) {
                songGenre1 = i + 1;
            } else if (points[i] == topPoint2) {
                songGenre2 = i + 1;
            }
        }

        System.out.println(songGenre1);
        System.out.println(songGenre2);
    }
}
