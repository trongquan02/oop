package lab7.shape;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcast
        System.out.println(shape);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
        System.out.println();
        Rectangle square = new Square(5.0);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println();
        Circle circle = new Circle();
        System.out.println((Shape) circle);
    }
}
