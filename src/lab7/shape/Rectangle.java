package lab7.shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "[Rectangle[" + super.toString() + ", width = " + this.width + ", length = " + this.length + "]";
    }
}
