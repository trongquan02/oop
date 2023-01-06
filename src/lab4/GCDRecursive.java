package lab4;

public class GCDRecursive {
    public static int gcd(int number1, int number2) {
        System.out.println(number1 + " " + number2);
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }

    public static void main(String[] args) {
        int number1 = 45;
        int number2 = 4;
        System.out.println("GCD(" + number1 + " " + number2 + ") = " + gcd(number1, number2));
    }
}
