package homework1;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        System.out.print("Enter a Hexadecimal string: ");
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toLowerCase();
        char inChar[];
        int inStrLen;
        inChar = inStr.toCharArray();
        inStrLen = inChar.length;
        int sum = 0;
        for (int index = inStrLen - 1; index >= 0; index--) {
            if (inChar[index] == 'a') {
                sum += 10 * Math.pow(16, inStrLen - index - 1);
            } else if (inChar[index] == 'b') {
                sum += 11 * Math.pow(16, inStrLen - index - 1);
            } else if (inChar[index] == 'c') {
                sum += 12 * Math.pow(16, inStrLen - index - 1);
            } else if (inChar[index] == 'd') {
                sum += 13 * Math.pow(16, inStrLen - index - 1);
            } else if (inChar[index] == 'e') {
                sum += 14 * Math.pow(16, inStrLen - index - 1);
            } else if (inChar[index] == 'f') {
                sum += 15 * Math.pow(16, inStrLen - index - 1);
            } else if (inChar[index] >= '0' && inChar[index] <= '9') {
                sum += (inChar[index] - '0') * Math.pow(16, inStrLen - index - 1);
            } else {
                System.out.printf("error: invalid hexadecimal string \"%s\"", inStr);
            }
        }
        System.out.println("The quivalent decimal number for hexadecimal " + inStr + " is " + sum);


    }

    // indexOf() lay ra so cua string
    public static boolean isValicHexString(String lowerHexString) {
        for (int i = 0; i < lowerHexString.length(); i++) {
            if (!(lowerHexString.charAt(i) >= '0' && lowerHexString.charAt(i) <= '9') || (lowerHexString.charAt(i) >= 'a' && lowerHexString.charAt(i) <= 'f')) {
                return false;
            }
        }
        return true;
    }

    public static int toHexDigit(char ch) {
        return Character.digit(ch, 16);
    }

    public static int toHexDigit2(char ch) {
        final String HEX_DIGIT = "0123456789abcdef";
        return HEX_DIGIT.indexOf(ch);
    }

    public static int convebtHex2Dec(String hexString) {
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            decimalValue = 16 * decimalValue + toHexDigit(hexString.charAt(i));
        }
        return decimalValue;
    }
}

// 123 = 1 * 16^2 + 2 * 16^1 + 3 * 16^0