package lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for (int i = 1; i <= MAX_DENOMINATOR; i++) {
            sumL2R += (double) (1 / i);
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        for (int denominator = MAX_DENOMINATOR; denominator >= 1; denominator--) {
            sumR2L += (double) (1 / denominator);
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);

        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }

        System.out.println("the absolute difference between these two sums : " + absDiff);
    }

}
