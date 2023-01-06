package homework1;

import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int numRows = sc.nextInt();
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col < 2 * numRows; col++) {
                if (col >= row && col <= 2 * numRows - row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
