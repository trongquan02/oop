package lab5.mycircleandmypoint;

public class TestMain {
    public static void main(String[] args) {
        MyPoint center = new MyPoint(1, 2);
        MyCircle circle = new MyCircle();
        MyCircle circle1 = new MyCircle(1, 1, 2);
        MyCircle circle2 = new MyCircle(center, 3);
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println("Radius: " + circle);
        circle.setRadius(5);
        System.out.println("Center: " + circle.getCenter());
        circle.setCenter(center);
        System.out.println("CenterX: " + circle.getCenterX());
        circle.setCenterX(2);
        System.out.println("CenterY: " + circle.getCenterY());
        circle.setCenterY(3);
        System.out.println(circle);

        System.out.println(circle.getCenterXY()[0]);
        System.out.println(circle.getCenterXY()[1]);
        circle.setCenterXY(3, 3);
        System.out.println(circle);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        MyCircle another = new MyCircle(9, 11, 3);
        System.out.println("Distance between 2 center: " + circle.distance(another));
    }
}
