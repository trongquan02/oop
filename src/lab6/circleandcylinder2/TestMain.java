package lab6.circleandcylinder2;

public class TestMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Circle circle = new Circle(4.0, "Green");
        System.out.println(circle);
        System.out.println("Area = " + cylinder.getArea());
        System.out.println("getVolume = " + cylinder.getVolume());
    }


}
