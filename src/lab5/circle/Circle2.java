package lab5.circle;

public class Circle2 {
    private double radius;

    public Circle2() {
        radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
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
