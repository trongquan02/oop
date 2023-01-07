package lab7.resizableandgeometricobject;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println(circle);
        System.out.println("Arae = " + circle.getArea());
        System.out.println("Perimeter" + circle.getPerimeter());
        System.out.println();
        Circle circle1 = new ResizableCircle(2);
        System.out.println("Arae = " + circle1.getArea());
        System.out.println("Perimeter" + circle1.getPerimeter());
        ((ResizableCircle) circle1).resize(10);
        System.out.println(circle1);
    }
}
