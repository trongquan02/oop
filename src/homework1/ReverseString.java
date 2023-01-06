package homework1;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s) {
        StringBuffer a = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            a.append(s.charAt(i));
        }
        return a.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();
        int inStrLen = inStr.length();
        System.out.print("The reverse of the String \"" + inStr + "\" is \"");
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }
        System.out.print("\".");
    }
}
