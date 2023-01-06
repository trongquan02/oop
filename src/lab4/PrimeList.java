package lab4;

import java.util.Scanner;

public class PrimeList {
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeList(int bound) {
        int amount = 0;
        for (int count = 1; count < bound; count++) {
            if (isPrime(count) == true) {
                System.out.println(count);
                amount++;
            }
        }
        double percent = (double) 100 * amount / bound;
        System.out.printf("[%d primes found (%.2f)]", amount, percent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int bound = sc.nextInt();
        primeList(bound);
    }
}
