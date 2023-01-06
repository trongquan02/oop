package lab1;

public class ComputePI {
    public static double computePI(int Max_1) {
        double sum = 0.0;
        for (int i = 1; i < Max_1; i++) {
            if (i % 2 == 1) {
                sum += 1.0 / (i * 2 - 1);
            } else {
                sum -= 1.0 / (i * 2 - 1);
            }
        }
        return 4 * sum;

    }

    public static void main(String[] args) {
        double sum = 0.0;
        int MAX = 1000;
        for (int i = 1; i <= MAX; i += 2) {
            if (i % 4 == 1) {
                sum += (double) 1 / i;
            } else if (i % 4 == 3) {
                sum -= (double) 1 / i;
            } else {
                System.out.println("Impossible");
            }
        }
        System.out.println("Pi: " + 4 * sum);
        System.out.println(computePI(1000));
        System.out.printf("(picomputed/Math.PI)*100 = %.2f \n)", (sum * 4) / Math.PI);
    }

}
