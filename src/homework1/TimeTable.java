package homework1;

import java.util.Scanner;

public class TimeTable {
    public static void printTimeTable(int n) {
        for (int i = -1; i <= n; i++) {
            if (i == -1) {
                System.out.print("   *\t|");
            } else if (i == 0) {
                System.out.print("------------");
            } else if (i > 0) {
                System.out.printf("%4d\t|", i);
            }

            for (int j = 1; j <= n; j++) {
                if (i == -1) {
                    System.out.printf("\t%d", j);
                    continue;
                } else if (i == 0) {
                    System.out.print("--------");
                    continue;
                }

                System.out.printf("\t%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        printTimeTable(size);
    }
}
