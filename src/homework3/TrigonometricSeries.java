package homework3;

public class TrigonometricSeries {
    public static double sin(double x, int numTermes) {
        double sinx = 0;
        double term = x;
        for (int i = 0; i <= numTermes; i++) {
            sinx += term;
            term *= (-1 * x * x) / ((2 * i + 2) * (2 * i + 3));
        }
        return sinx;
    }

    public static double cos(double x, int numTerms) {
        double cosx = 0;
        double term = 1;
        for (int i = 0; i <= numTerms; i++) {
            cosx += term;
            term *= (-1 * x * x) / ((2 * i + 1) * (2 * i + 2));
        }
        return cosx;
    }

    public static void main(String[] args) {
        double x = 10;
        int numTerms = 200;
        System.out.println("sin(" + x + "): " + sin(x, numTerms));
        System.out.println("Value of sin " + x + " by java.lang.Math.sin(): " + Math.sin(x));
        System.out.println("cos(" + x + "): " + cos(x, numTerms));
        System.out.println("Value of cos " + x + " by java.lang.Math.cos(): " + Math.cos(x));
    }
}
