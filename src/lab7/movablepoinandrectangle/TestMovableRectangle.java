package lab7.movablepoinandrectangle;

public class TestMovableRectangle {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(1, 2, 3, 4, 5, 6);
        System.out.println(movableRectangle);
        movableRectangle.moveUp();
        System.out.println(movableRectangle);
    }

}
