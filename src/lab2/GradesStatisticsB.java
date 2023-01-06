package lab2;

import java.util.Scanner;

public class GradesStatisticsB {
    static Scanner sc = new Scanner(System.in);
    public static int[] student;
    public static void print(int[] student) {
        if (student.length > 1) {
            for (int i = 0; i < student.length; i++) {
                if (i == 0) {
                    System.out.print("[" + student[i] + " ");
                } else if (i == student.length - 1) {
                    System.out.println(", " + student[i] + "]");
                } else {
                    System.out.print(", " + student[i]);
                }
            }
        } else if (student.length == 1) {
            System.out.println("[" + student[0] + "]");
        } else {
            System.out.println("[]");
        }
    }

    public static double average(int[] student) {
        if (student == null) {
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < student.length; i++) {
            sum += student[i];
        }
        return sum / student.length;

    }

    public static int min(int[] student) {
        if (student == null) {
            return -1;
        }
        int min = student[0];
        for (int i = 0; i < student.length; i++) {
            if (min >= student[i]) {
                min = student[i];
            }
        }
        return min;
    }

    public static int max(int[] student) {
        if (student == null) {
            return -1;
        }
        int max = student[0];
        for (int i = 0; i < student.length; i++) {
            if (max <= student[i]) {
                max = student[i];
            }
        }
        return max;

    }

    public static double stdDve(int[] student) {
        double number = 0.0;
        double avg = average(student);
        if (student == null) {
            return -1.0;
        }
        for (int i = 0; i < student.length; i++) {
            double phi = student[i] * student[i] - avg * avg;
            number += phi;
        }
        return Math.sqrt(number / student.length);
    }

    public static double median(int[] student) {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[i] > student[j]) {
                    int temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
            if (student.length % 2 != 0) {
                return student[((student.length + 1) / 2) - 1];
            }
        }
        return (student[student.length / 2 - 1] + student[(student.length / 2)]) / 2;
    }
    public static int[] grades(int numStudents) {;
        student = new int[numStudents];
        if (numStudents > 0) {
            for (int i = 0; i < numStudents; i++) {
                System.out.printf("Enter the grade for student %d: ", i + 1);
                student[i] = sc.nextInt();
            }
        }
        return student;
    }
    public static void readGrades() {
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        grades(numStudents);
    }


        public static void main (String[]args){
            readGrades();
            System.out.println("The grades are: ");
            print(student);
            System.out.printf("The average is : %.2f\n", average(student));
            System.out.printf("The minimum is: %d\n", min(student));
            System.out.printf("The maximum is: = %d\n", max(student));
            System.out.printf("The median is: = %.2f\n", median(student));
            System.out.printf("The standard is: = %.2f\n", stdDve(student));
        }
    }
