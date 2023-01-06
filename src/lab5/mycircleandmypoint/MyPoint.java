package lab5.mycircleandmypoint;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = {x, y};
        return arr;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("(").append(this.x).append(", ").append(this.y).append(")");
        return description.toString();
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        double result = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return result;
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        double result = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return result;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

}
