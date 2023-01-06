package homework3;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        final String SECRET_WORD = "testing";
        String temp = "";
        for (int i = 0; i < SECRET_WORD.length(); i++) {
            temp += "_";
        }
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String key = sc.nextLine();
            for (int i = 0; i < SECRET_WORD.length(); i++) {
                if (key.equals(Character.toString(SECRET_WORD.charAt(i)))) {
                    temp = temp.substring(0, i) + key + temp.substring(i + 1, temp.length());
                }
            }
            if (temp.equals(SECRET_WORD) || key.equals(SECRET_WORD)) {
                System.out.println("Congratulation!");
                System.out.println("You got in " + count + " trials!");
                break;
            }
            System.out.println("Trial " + count + " : " + temp);
            count++;
        }
    }
}
