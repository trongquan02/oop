package lab5.circle;

public class Circle1 {
    private double radius;
    private String color;

    public Circle1() {
        radius = 1.0;
        color = "red";
    }

    public Circle1(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }


    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Circle");
        description.append("[");
        description.append(this.radius);
        description.append("]");
        return description.toString();
    }
}
