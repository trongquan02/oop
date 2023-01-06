package homework1;

import java.util.Scanner;

public class HillPatternC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int numRows = sc.nextInt();
        for (int row = 1; row < 2 * numRows; row++) {
            for (int col = 1; col < 2 * numRows; col++) {
                if (col + row > numRows && row > col - numRows
                        && col > row - numRows && col + row < 3 * numRows) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
