package lab5.mytriangleandmypoint;

public class TestMain {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(1, 2);
        MyPoint v3 = new MyPoint(1, -2);
        MyTriangle triangle = new MyTriangle(1, 2, 5, 4, 5, 6);
        MyTriangle triangle1 = new MyTriangle(v1, v2, v3);

        System.out.println(triangle);
        System.out.println(triangle1);

        System.out.println(triangle.getPerimeter());

        System.out.println(triangle.getType());
        System.out.println(triangle1.getType());
    }

}
