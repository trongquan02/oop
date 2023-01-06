package lab4;

public class GCD {
    public static int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static void main(String[] args) {
        int number1 = 45;
        int number2 = 30;
        System.out.println("GCD(" + number1 + " " + number2 + ") = " + gcd(number1, number2));
    }
}
