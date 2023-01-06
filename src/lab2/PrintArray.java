package lab2;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        System.out.println("Enter the value of all items: ");
        int[] items = new int[NUM_ITEMS];
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.printf("[%d", items[i]);
            } else if (i == items.length - 1) {
                System.out.printf(",%d]", items[i]);
            } else {
                System.out.printf(",%d", items[i]);
            }
        }
    }
}
