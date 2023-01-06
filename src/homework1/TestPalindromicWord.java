package homework1;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a work: ");
        String inWork = sc.nextLine().toLowerCase();
        String newWork = "";

        int workLen = inWork.length();
        for (int i = workLen - 1; i >= 0; i--) {
            newWork += inWork.charAt(i);
        }
        if (newWork.equals(inWork)) {
            System.out.println(inWork + " is a palindrome.");
        } else {
            System.out.println(inWork + " isn't a palindrome.");
        }

    }

}
