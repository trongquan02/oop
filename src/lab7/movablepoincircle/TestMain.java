package lab7.movablepoincircle;

public class TestMain {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(1, 2, 3, 4, 1);
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }


}
