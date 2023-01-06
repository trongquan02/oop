package lab2;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
            System.out.println("Enter the element of array 1:");
            for (int i = 0; i < array2.length; i++) {
                array2[i] = sc.nextInt();
            }
        }
        if (swap(array1, array2) == false) {
            System.out.print("false");
        } else {
            System.out.print("true");
        }
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = array2[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }
}
