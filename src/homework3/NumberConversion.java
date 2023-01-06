package homework3;

import java.util.Scanner;

public class NumberConversion {
    static final String ALPHABET = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix : ");
        String inStr = sc.next();
        System.out.print("Enter the input radix : ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix : ");
        int outRadix = sc.nextInt();
        String result = toRadix(inStr, inRadix, outRadix);
        System.out.printf("%1$s in radix %2$d is \"%3$s\" in radix %4$d",
                inStr, inRadix, result, outRadix);
    }

    public static int toInt(String str, int inRadix) {
        int result = 0;
        for (int charIdx = 0; charIdx < str.length(); charIdx++) {
            result = result * inRadix + Character.digit(str.charAt(charIdx), inRadix);
        }
        return result;
    }

    public static String toRadix(int num, int outRadix) {
        String result = "";
        while (num > 0) {
            result = ALPHABET.charAt(num % outRadix) + result;
            num /= outRadix;
            System.out.println(result);
        }
        return result;
    }

    public static String toRadix(String str, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return str;
        }
        return toRadix(toInt(str, inRadix), outRadix);
    }
}
