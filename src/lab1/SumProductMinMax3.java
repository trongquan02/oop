package lab1;

import java.util.Scanner;

public class SumProductMinMax3 {
    static Scanner input = new Scanner(System.in);

    public static void SumProductMinMax3() {
        System.out.print("number 1: ");
        int number1 = input.nextInt();
        System.out.print("number 2: ");
        int number2 = input.nextInt();
        System.out.print("number 3: ");
        int number3 = input.nextInt();

        int sum;
        int product;
        int min;
        int max;

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        min = number1;
        if (number2 < min)
            min = number2;
        if (number3 < min)
            min = number3;
        max = number1;
        if (number2 > max)
            max = number2;
        if (number3 > max)
            max = number3;
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }

    public static void SumProductMinMax5() {
        System.out.print("number 1: ");
        int number1 = input.nextInt();
        System.out.print("number 2: ");
        int number2 = input.nextInt();
        System.out.print("number 3: ");
        int number3 = input.nextInt();
        System.out.print("number 4: ");
        int number4 = input.nextInt();
        System.out.print("number 5: ");
        int number5 = input.nextInt();

        int sum;
        int product;
        int min;
        int max;

        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;
        min = number1;
        if (number2 < min)
            min = number2;
        if (number3 < min)
            min = number3;
        if (number4 < min)
            min = number4;
        if (number5 < min)
            min = number5;
        max = number1;
        if (number2 > max)
            max = number2;
        if (number3 > max)
            max = number3;
        if (number4 > max)
            max = number4;
        if (number5 > max)
            max = number5;
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }

    public static void main(String[] args) {
        SumProductMinMax3();
        SumProductMinMax5();
    }

}
