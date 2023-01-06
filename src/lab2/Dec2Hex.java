package lab2;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        final String HEX = "0123456789ABCDEF";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal nummber: ");
        int number = sc.nextInt();
        String result = "";
        while (number > 0) {
            int remainder = number % 16;
            result = result + HEX.charAt(remainder);
            number = number / 16;
        }
        System.out.print("The equivalent hexdexmal number is ");
        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }

    }
}
