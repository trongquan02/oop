package lab1;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double baseArea = Math.PI * radius * radius;
        double sufaceAre = 2.0 * Math.PI + 2.0 * baseArea;
        double volume = baseArea * height;
        System.out.printf("base area : %.2f \n", baseArea);
        System.out.printf("suface area : %.2f \n", sufaceAre);
        System.out.printf("Volume : %.2f \n", volume);
    }
}
