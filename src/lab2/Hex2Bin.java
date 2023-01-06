package lab2;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001",
                "1010", "1011", "1100", "1101", "1110", "1111"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inStr = sc.nextLine().toUpperCase();
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (c >= '0' && c <= '9') {
                int idx = Character.getNumericValue(c);
                System.out.print(HEX_BITS[idx] + " ");
            } else if (c == 'A') {
                System.out.print(HEX_BITS[10] + " ");
            } else if (c == 'B') {
                System.out.print(HEX_BITS[11] + " ");
            } else if (c == 'C') {
                System.out.print(HEX_BITS[12] + " ");
            } else if (c == 'D') {
                System.out.print(HEX_BITS[13] + " ");
            } else if (c == 'E') {
                System.out.print(HEX_BITS[14] + " ");
            } else if (c == 'F') {
                System.out.print(HEX_BITS[15] + " ");

            }
        }
    }

}

