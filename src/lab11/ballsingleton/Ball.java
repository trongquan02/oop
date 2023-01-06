package lab11.ballsingleton;

public class Ball {
    private static Ball ball;
    private String color;

    private Ball(String color) {
        this.color = color;
    }

    public static Ball getBall(String color) {
        if (ball == null) {
            ball = new Ball(color);
        }
        return ball;
    }
}
