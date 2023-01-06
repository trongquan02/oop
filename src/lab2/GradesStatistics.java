package lab2;

import java.util.Scanner;

public class GradesStatistics {
    public static void printAverage(int[] student) {
        if (student == null) {
            return;
        }
        double sum = 0;
        for (int i = 0; i < student.length; i++) {
            sum += student[i];
        }
        System.out.printf("The average is : %.2f\n", sum / student.length);
    }

    public static void printMin(int[] student) {
        if (student == null) {
            return;
        }
        int min = student[0];
        for (int i = 0; i < student.length; i++) {
            if (min >= student[i]) {
                min = student[i];
            }
        }
        System.out.printf("The minimum is: %d\n", min);
    }

    public static void printMax(int[] student) {
        if (student == null) {
            return;
        }
        int max = student[0];
        for (int i = 0; i < student.length; i++) {
            if (max <= student[i]) {
                max = student[i];
            }
        }
        System.out.printf("The maxximum is: = %d\n", max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] student = new int[numStudents];
        if (numStudents > 0) {
            for (int i = 0; i < numStudents; i++) {
                System.out.printf("Enter the grade for student %d: ", i + 1 );
                student[i] = sc.nextInt();
            }
        }
        printAverage(student);
        printMin(student);
        printMax(student);
    }
}
