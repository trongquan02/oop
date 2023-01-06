package lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENT = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;
        for (int studentNo = 1; studentNo <= NUM_STUDENT; ++studentNo) {
            isValid = false;
            do {
                System.out.print("Enter a number between: ");
                numberIn = sc.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;
        }
        average = (double) sum / NUM_STUDENT;
        System.out.printf("The average is: %.2f", average);
    }
}
