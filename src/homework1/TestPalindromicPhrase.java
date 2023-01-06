package homework1;

import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a phrase: ");
        String str = sc.nextLine();
        String newStr = str.toLowerCase();
        String fStr = "";
        String bStr = "";

        for (int fIdx = 0; fIdx < str.length(); fIdx++) {
            char getFChar = newStr.charAt(fIdx);
            if (getFChar >= 'a' && getFChar <= 'z') {
                fStr += getFChar;
            }
        }

        for (int bIdx = str.length() - 1; bIdx >= 0; bIdx--) {
            char getBChar = newStr.charAt(bIdx);
            if (getBChar >= 'a' && getBChar <= 'z') {
                bStr += getBChar;
            }
        }

        if (fStr.equalsIgnoreCase(bStr)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" isn't a palindrome.");
        }
    }
}
