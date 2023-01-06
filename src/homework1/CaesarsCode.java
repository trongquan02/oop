package homework1;

import java.util.Scanner;

public class CaesarsCode {
    public static void main(String[] args) {
        String inStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintexts tring: ");
        inStr = in.next().toUpperCase();
        System.out.print("The ciphertext string is: ");
        caesar(inStr);
    }

    public static void caesar(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char c = inStr.charAt(charIdx);
            if (c >= 'A' && c <= 'W') {
                c = (char) (c + 3);
                System.out.print(c);
            } else if (c == 'X') {
                System.out.print('A');
            } else if (c == 'Y') {
                System.out.print('B');
            } else if (c == 'Z') {
                System.out.print('C');
            }
        }
    }
}
