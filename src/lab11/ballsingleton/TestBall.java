package lab11.ballsingleton;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = Ball.getBall("red");
        System.out.println(ball1);
        Ball ball2 = Ball.getBall("green");
        System.out.println(ball2);
    }
}
