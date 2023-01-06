package lab2;

import java.util.Scanner;

public class Contains {
    public static boolean contains(int[] array, int key) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        if (number > 0) {
            System.out.println("Enter the array:");
            for (int i = 0; i < number; i++) {
                array[i] = sc.nextInt();
            }
        }
        System.out.print(contains(array, key));
    }
}
