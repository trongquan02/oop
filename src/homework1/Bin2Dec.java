package homework1;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String inStr = sc.nextLine().toLowerCase();
        int inStrLen = inStr.length();
        int sum = 0;
        for (int index = inStrLen - 1; index >= 0; index--) {
            if (inStr.charAt(index) != '1' && inStr.charAt(index) != '0') {
                System.out.printf("error: invalid binary string \"%s\"", inStr);
                break;
            } else if (inStr.charAt(index) == '1') {
                sum += Math.pow(2, (inStrLen - index - 1));
            }
        }

        System.out.printf("The equivalent decimal number for binary \"%s\" is:  %d", inStr, sum);
    }

}
// 111001  = 1⋅* 2^5 + 1⋅ * 2^4 + 1⋅ * 2 ^3 + 0⋅ * 2^2 + 0⋅*2^1 + 1⋅ * 2^0