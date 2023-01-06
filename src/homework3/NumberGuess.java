package homework3;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
//        muon random tu a den b thi (int) ((Math.random() * (b - a)) + a
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Key in your guess:");
        int key = sc.nextInt();
        while (true) {
            if (key > SECRET_NUMBER) {
                System.out.println("Try lower");
                count++;
                key = sc.nextInt();
            } else if (key < SECRET_NUMBER) {
                System.out.println("Try heigher");
                count++;
                key = sc.nextInt();
            } else {
                System.out.printf("You got it in %d trials!", count);
                break;
            }
        }
    }

}
