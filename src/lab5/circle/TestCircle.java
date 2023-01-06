package lab5.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        System.out.println("The circle has radius of " + circle1.getRadius()
                + " and are of " + circle1.getArea());
        Circle1 circle2 = new Circle1(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius()
                + " and are of " + circle2.getArea());
        Circle1 circle4 = new Circle1();
        circle4.setRadius(5.5);
        System.out.println("Radius is: " + circle4.getRadius());
        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());
        Circle1 circle5 = new Circle1(5.5);
        System.out.println(circle5.toString());
    }
}
