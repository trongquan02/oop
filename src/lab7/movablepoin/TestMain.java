package lab7.movablepoin;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println("moveUp" + movablePoint);
        movablePoint.moveDown();
        System.out.println("moveDown" + movablePoint);
    }
}
