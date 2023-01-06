package homework1;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        String strString;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintexts tring: ");
        strString = sc.nextLine().toUpperCase();
        sc.close();
        StringBuilder result = new StringBuilder();
        for (int a = 0; a < strString.length(); a++) {
            char c = strString.charAt(a);
            char instr = (char) ('A' + 'Z' - c);
            result.append(instr);
        }
        System.out.println("The ciphertext string is: " + result);

    }

}
