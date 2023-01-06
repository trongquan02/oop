package lab5.myreactangleandmypoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int x2, int y1, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.bottomRight = botRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopRight() {
        return new MyPoint(bottomRight.getX(), topLeft.getY());
    }

    public MyPoint getBotLeft() {
        return new MyPoint(topLeft.getX(), bottomRight.getY());
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", topRight=" + getTopRight() + ", bottomLeft=" + getBotLeft() + ", bottomRight=" + bottomRight + "]";
    }

    public double distance() {
        return topLeft.distance(bottomRight);
    }

    public double getArea() {
        double length = getBotLeft().distance(getBottomRight());
        double width = getBotLeft().distance(getTopLeft());
        return length * width;
    }

    public double getPrimeter() {
        double length = getBotLeft().distance(getBottomRight());
        double width = getBotLeft().distance(getTopLeft());
        return 2 * (length + width);
    }

}
