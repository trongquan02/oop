package lab1;

import java.util.Scanner;
public class SphereComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double SufaceArea = 4 * Math.PI * radius * radius;
        double valume = (4 / 3) * Math.PI * radius * radius * radius;
        //
        System.out.printf("suface area : %.2f \n", SufaceArea);
        System.out.printf("valume : %.2f \n", valume);
    }
}
