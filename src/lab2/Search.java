package lab2;

import java.util.Scanner;

public class Search {
    public static int search(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;

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
        System.out.print(search(array, key));
    }
}
