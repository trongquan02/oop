package homework6.ballandcontainer;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.1f, 2.2f, 3, 6, 60);
        System.out.println(ball);
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());
        System.out.println("Radius: " + ball.getRadius());
        System.out.println("XDelta: " + ball.getXDelta());
        System.out.println("YDelta: " + ball.getYDelta());
        ball.reflectHorizontal();
        System.out.println(ball);
        ball.reflectVertical();
        System.out.println(ball);
    }
}
