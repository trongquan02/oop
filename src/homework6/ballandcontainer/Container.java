package homework6.ballandcontainer;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y2 = y;
        x2 = x1 + width  - 1;
        y2 = y1 + height - 1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return (x2 - x1 + 1);
    }

    public int getHeight() {
        return (y2 - y1 + 1);
    }
    public boolean collidesWith(Ball ball)
    {
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() + ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ball.getY() - ball.getRadius() <= this.y1 ||
                ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }

    public String toString() {
        return "Container[(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";
    }

}
