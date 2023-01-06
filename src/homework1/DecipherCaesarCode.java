package homework1;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        String inStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext tring: ");
        inStr = in.next().toUpperCase();
        System.out.print("The plaintexts string is: ");
        caesar(inStr);
    }

    public static void caesar(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char c = inStr.charAt(charIdx);
            if (c >= 'D' && c <= 'Z') {
                c = (char) (c - 3);
                System.out.print(c);
            } else if (c == 'A') {
                System.out.print('X');
            } else if (c == 'B') {
                System.out.print('Y');
            } else if (c == 'C') {
                System.out.print('Z');
            }
        }
    }
}
