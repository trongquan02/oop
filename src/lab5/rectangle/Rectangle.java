package lab5.rectangle;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        float length = 1.0f;
        float width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("[")
                .append(this.length)
                .append(", ")
                .append(this.width)
                .append("]");
        return description.toString();
    }
}
