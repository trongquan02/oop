package lab2;

import java.util.Scanner;

public class Equals {
    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                array1[i] = array2[i];
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length 1: ");
        int number1 = sc.nextInt();
        int[] array1 = new int[number1];
        if (array1.length > 0) {
            System.out.println("Enter the element of array 1:");
            for (int i = 0; i < array1.length; i++) {
                array1[i] = sc.nextInt();
            }
        }
        System.out.print("Enter the array length 2: ");
        int number2 = sc.nextInt();
        int[] array2 = new int[number2];
        if (array2.length > 0) {
            System.out.println("Enter the element of array 2:");
            for (int i = 0; i < array2.length; i++) {
                array2[i] = sc.nextInt();
            }
        }
        if (equals(array1, array2) == true) {
            System.out.print("Two equal arrays");
        } else {
            System.out.print("Two arrays are not equal");
        }
    }
}
