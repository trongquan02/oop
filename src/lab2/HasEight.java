package lab2;

import java.util.Scanner;

public class HasEight {
    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        final int SENTINEL = -1;
        Scanner sc = new Scanner(System.in);
        int number;
        int sumMagic = 0;
        System.out.print("Enter a positive integer (or -1 to end):");
        number = sc.nextInt();
        while (number != SENTINEL) {
            if (hasEight(number)) {
                sumMagic += number;
            }
            System.out.print("Enter a positive integer (or -1 to end):");
            number = sc.nextInt();
        }
        System.out.print("The magic sum is: " + sumMagic);
    }
}
