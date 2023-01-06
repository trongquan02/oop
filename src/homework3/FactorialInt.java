package homework3;

public class FactorialInt {
    public static long factorialInt(int number) {
        long fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        return fac;
    }

    public static boolean checkFactorial(int number) {
        int max = Integer.MAX_VALUE;
        long fac = factorialInt(number);
        if (fac < max) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 1;
        while (checkFactorial(number) == true) {
            System.out.printf("The factorial of %d is %d\n", number, factorialInt(number));
            number++;
        }
        System.out.printf("The factorial of %d is out of range", number);
    }


}
