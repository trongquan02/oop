package lab2;

import java.util.Scanner;

public class Reveree {
    public static void revers(int[] array) {
        if (array == null) {
            return;
        }
        for (int fldx = 0, bldx = array.length - 1; fldx < bldx; ++fldx, --bldx) {
            int temp = array[fldx];
            array[fldx] = array[bldx];
            array[bldx] = temp;
        }
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i] + " ");
                } else if (i == array.length - 1) {
                    System.out.println(", " + array[i] + "]");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        } else if (array.length == 1) {
            System.out.println("[" + array[0] + "]");
        } else {
            System.out.println("[]");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        if (array.length > 0) {
            System.out.println("Enter the element of array :");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
        }
        revers(array);
    }
}
