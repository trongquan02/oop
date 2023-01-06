package lab4;

public class FibonacciRecursive {
    public static int fibanacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibanacci(number - 1) + fibanacci(number - 2);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Fibonacci(" + number + ") = " + fibanacci(number));
    }
}
