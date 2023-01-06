package lab5.myreactangleandmypoint;

public class TestMain {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 7);
        MyPoint bottomRight = new MyPoint(5, 2);
        MyRectangle rectangle = new MyRectangle(-3, 4, 0, 0);
        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);

        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPrimeter());
    }
}
