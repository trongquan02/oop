package lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int bound = sc.nextInt();
        int amount = 0;
        System.out.println("These numbers are perfect: ");
        for (int count = 2; count <= bound; count++) {
            if (isProductOfPrimeFactors(count)) {
                System.out.print(count + " ");
                amount++;
            }
        }
        System.out.println();
        double percent = (double) 100 * amount / bound;
        System.out.printf("[" + amount + " numbers found (%.2f", percent);
        System.out.println("%)]");
        System.out.println();
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i < aPosInt; i++) {
            if (isPrime(i) && aPosInt % i == 0) {
                product *= i;
            }
        }
        if (product == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt == 1) {
            return false;
        }
        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }
}
