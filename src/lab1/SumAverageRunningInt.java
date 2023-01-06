package lab1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average = sum / UPPERBOUND;
        System.out.println("sum = " + sum + " average = " + average);

        // while
        int sum_1 = 0;
        double average_1;
        int number_1 = LOWERBOUND;
        while (number_1 <= UPPERBOUND) {
            sum_1 += number_1;
            ++number_1;
        }
        average_1 = sum_1 / UPPERBOUND;
        System.out.println("sum_1 = " + sum_1 + " average_1 = " + average_1);
        // do while
        int sum_2 = 0;
        double average_2;
        int number_2 = LOWERBOUND;
        do {
            sum_2 += number_2;
            ++number_2;
        } while (number_2 <= UPPERBOUND);
        average_2 = sum_2 / UPPERBOUND;
        System.out.println("sum_2 = " + sum_2 + " average_2 = " + average_2);


    }

}
