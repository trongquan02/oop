package homework3;

public class FibonacciInt {
    public static long fibonacciInt(int number) {
        long f0 = 0;
        long f1 = 1;
        long fn = 0;
        if (number < 2) {
            return number;
        }
        for (int i = 0; i <= number - 2; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciInt(38));
        int number = 0;
        int max = Integer.MAX_VALUE;
        while (fibonacciInt(number) < max) {
            System.out.println("F(" + number + ") = " + fibonacciInt(number));
            number++;
        }
        System.out.println("F(" + number + ") is out of the range of int");
    }
}
