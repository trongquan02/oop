package lab7.geometrixobject;

import lab7.shape.Circle;
import lab7.shape.Rectangle;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter" + circle.getPerimeter());
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("Perimeter" + rectangle.getPerimeter());
        System.out.println("Area = " + rectangle.getArea());
    }
}
