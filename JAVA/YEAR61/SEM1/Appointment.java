package JAVA.YEAR61.SEM1;

import java.util.Scanner;

public class Appointment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int bh1 = scanner.nextInt();
        int bm1 = scanner.nextInt();
        int eh1 = scanner.nextInt();
        int em1 = scanner.nextInt();

        int bh2 = scanner.nextInt();
        int bm2 = scanner.nextInt();
        int eh2 = scanner.nextInt();
        int em2 = scanner.nextInt();
		scanner.close();

        int bh12;
        int bm12;
        int eh12;
        int em12;

        // Find maximum beginning time
        if (bh1 > bh2) {
            bh12 = bh1;
            bm12 = bm1;
        } else if (bh2 > bh1) {
            bh12 = bh2;
            bm12 = bm2;
        } else {
            // bh1 == bh2, Need Check Minute
            bh12 = bh1;
            if (bm1 > bm2) {
                bm12 = bm1;
            } else {
                bm12 = bm2;
            }
        }

        // Find minimum end time
        if (eh1 < eh2) {
            eh12 = eh1;
            em12 = em1;
        } else if (eh2 < eh1) {
            eh12 = eh2;
            em12 = em2;
        } else {
            // eh1 == eh2, Need Check Minute
            eh12 = eh1;
            if (em1 < em2) {
                em12 = em1;
            } else {
                em12 = em2;
            }
        }

        // Check Invalid if Beginning Time greater than or equal to End Time
        if ((bh12 * 60 + bm12) >= (eh12 * 60 + em12)) {
            bh12 = 0;
            bm12 = 0;
            eh12 = 0;
            em12 = 0;
        }

        System.out.println(bh12 + " " + bm12 + " " + eh12 + " " + em12);
    }
}
