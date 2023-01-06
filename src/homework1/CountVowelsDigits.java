package homework1;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        int numVowels = 0;
        int numDigits = 0;
        int inStrLen = inStr.length();
        String inStrLower = inStr.toLowerCase();
        for (int i = 0; i < inStrLen; i++) {
            char inChar = inStr.charAt(i);
            if (inChar == 'a' || inChar == 'e' || inChar == 'i'
                    || inChar == 'o' || inChar == 'u') {
                numVowels++;
            } else if (inChar >= '0' && inChar <= '9') {
                numDigits++;
            }
        }
        double percentVowels = (double) 100 * numVowels / inStrLen;
        double percentDigits = (double) 100 * numDigits / inStrLen;
        System.out.printf("Number of vowels: %d (%.2f%%)\n", numVowels, percentVowels);
        System.out.printf("Number of digits: %d (%.2f%%)\n", numDigits, percentDigits);
    }

}

