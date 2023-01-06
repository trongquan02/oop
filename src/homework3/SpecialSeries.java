package homework3;

import java.util.Scanner;

public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {
        double result = x;
        double sum = x;
        for (int i = 0; i <= numTerms; i++) {
            result *= ((2 * i + 1) * x * x) / ((2 * i + 2));
            sum += result / (2 * i + 3);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter value of x: ");
        double x = sc.nextDouble();
        while (x < -1 || x > 1) {
            System.out.println("Invalid value!!");
            System.out.printf("Enter value of x: ");
            x = sc.nextDouble();
        }
        System.out.printf("Enter value of term: ");
        int numTerms = sc.nextInt();
        System.out.println("Sum of the series: " + specialSeries(x, numTerms));
    }
}
