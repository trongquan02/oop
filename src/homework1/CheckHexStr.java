package homework1;

import java.util.Scanner;

public class CheckHexStr {
    public static boolean isValidHexString(String hexString) {
        hexString = hexString.toLowerCase();
        final String HEX_STRING = "123456789abcdef";
        for (int i = 0; i < hexString.length(); i++) {
            if (HEX_STRING.indexOf(hexString.charAt(i)) == -1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        int inStrLen = inStr.length();
        int count = 0;
        for (int i = 0; i < inStrLen; i++) {
            char c = inStr.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f')) {
                count += 1;
            }
        }
        if (count == inStrLen) {
            System.out.println("\"" + inStr + "\" is a hex string");
        } else {
            System.out.println("\"" + inStr + "\" is NOT a hex string");
        }
    }

}
