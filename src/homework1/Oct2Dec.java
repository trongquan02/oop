package homework1;

public class Oct2Dec {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Octal string: ");
//        String inStr = sc.nextLine().toLowerCase();
//        int inStrLen = inStr.length();
//        int sum = 0;
//        for (int index = inStrLen - 1; index >= 0; index--) {
//             if (inStr.charAt(index) >= '0' && inStr.charAt(index) <= '7') {
//                sum += (inStr.charAt(index) - '0') * Math.pow(8, (inStrLen - index - 1));
//             }
//        }
//        System.out.printf("The equivalent decimal number \"%s\" is:  %d", inStr, sum);
        String obsString = "148";
        System.out.print(convebtOct2Dec(obsString));
    }

    public static boolean isValidOctString(String obsString) {
        for (int i = 0; i < obsString.length(); i++) {
            if (!(obsString.charAt(i) >= '0' && obsString.charAt(i) <= '7')) {
                return false;
            }
        }
        return true;
    }

    public static int toOctDigit(char ch) {

        return Character.digit(ch, 8);
    }

    public static int convebtOct2Dec(String hexString) {
        if (isValidOctString(hexString) == true) {
            int octValue = 0;
            for (int i = 0; i < hexString.length(); i++) {
                octValue = 8 * octValue + toOctDigit(hexString.charAt(i));
            }
            return octValue;
        } else {
            return -1;
        }
    }
}
