package homework1;

import java.util.Scanner;

public class RadixN2Dec1 {
    public static void Bin2Dec(String inStr, char inChar[], int inStrLen) {
        int sum = 0;

        for (int index = inStrLen - 1; index >= 0; index--) {
            if (inChar[index] != '1' && inChar[index] != '0') {
                System.out.printf("error: invalid binary string \"%s\"", inStr);
                return;
            } else if (inChar[index] == '1') {
                sum += Math.pow(2, (inStrLen - index - 1));
            }
        }
        System.out.printf("The equivalent decimal number \"%s\" is:  %d", inStr, sum);
    }

    public static void Hex2Dec(String inStr, char inChar[], int inStrLen) {
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
        System.out.printf("The equivalent decimal number \"%s\" is:  %d", inStr, sum);
    }

    public static void Oct2Dec(String inStr, char inChar[], int inStrLen) {
        int sum = 0;

        for (int index = inStrLen - 1; index >= 0; index--) {
            if (inChar[index] >= 'a' && inChar[index] <= 'z') {
                System.out.printf("error: invalid Octal string \"%s\"", inStr);
                return;
            }
            sum += (inChar[index] - '0') * Math.pow(8, inStrLen - index - 1);
        }
        System.out.println("The equivalent decimal number " + inStr + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the redix: ");
        int radix = sc.nextInt();
        System.out.print("Enter the string: ");
        String inStr = sc.next().toLowerCase();
        char inChar[];
        int inStrLen;
        inChar = inStr.toCharArray();
        inStrLen = inChar.length;
        if (radix == 2) {
            Bin2Dec(inStr, inChar, inStrLen);
        } else if (radix == 8) {
            Oct2Dec(inStr, inChar, inStrLen);
        } else if (radix == 16) {
            Hex2Dec(inStr, inChar, inStrLen);
        } else {
            System.out.println("there is no radix");
        }
    }
}
