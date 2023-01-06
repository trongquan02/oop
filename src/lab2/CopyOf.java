package lab2;

import java.util.Scanner;

public class CopyOf {
    public static int[] copyOf(int[] array) {
        if (array == null) {
            return null;
        }
        int size = array.length;
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public static int[] copyOf(int[] array, int newlength) {
        if (array == null) {
            return null;
        }
        int size = array.length;
        int[] array2 = new int[newlength];
        if (size <= newlength) {
            for (int i = 0; i < size; i++) {
                array2[i] = array[i];
            }
        } else {
            for (int i = 0; i < newlength; i++) {
                array2[i] = array[i];
            }
        }
        return array2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        if (size > 0) {
            System.out.println("Enter aray elements:");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
        }
        System.out.print("array copy: ");
        int[] array1 = copyOf(array);
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the newlength: ");
        int newlength = sc.nextInt();
        int[] array2 = copyOf(array, newlength);
        System.out.print("array coppy: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

}
