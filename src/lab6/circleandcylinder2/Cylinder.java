package lab6.circleandcylinder2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getArea() {
        return 2 * base.getArea()
                + 2 * Math.PI * base.getRadius() * this.height;
    }

    public double getVolume() {
        return Math.PI * base.getRadius() * base.getRadius() * this.height;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Cylinder[")
                .append(base.toString())
                .append(", height = ")
                .append(height)
                .append("]");
        return description.toString();
    }
}
