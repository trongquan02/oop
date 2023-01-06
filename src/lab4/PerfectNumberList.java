package lab4;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int bound = sc.nextInt();
        int amount1 = 0;
        System.out.println("These numbers are perfect: ");
        for (int count = 1; count <= bound; count++) {
            if (isPerfect(count)) {
                System.out.print(count + " ");
                amount1++;
            }
        }
        System.out.println();
        double percent1 = (double) 100 * amount1 / bound;
        System.out.printf("[" + amount1 + " perfect numbers found (%.2f", percent1);
        System.out.println("%)]");
        System.out.println();

        System.out.println("These numbers are neither deficient nor perfect:");
        int amount2 = 0;
        for (int count = 1; count <= bound; count++) {
            if (isPerfect(count)) {
                continue;
            } else if (isDeficient(count)) {
                continue;
            } else {
                System.out.print(count + " ");
                amount2++;
            }
        }
        System.out.println();
        double percent2 = (double) 100 * amount2 / bound;
        System.out.printf("[" + amount2 + " numbers found (%.2f", percent2);
        System.out.println("%)]");

    }

    public static boolean isPerfect(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        }
        return false;
    }

}
