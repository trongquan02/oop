package lab6.pointandline;

public class TestLineSub {
    public static void main(String[] args) {
        Point end = new Point(3, 4);
        LineSub l1 = new LineSub(1, 5, end);
        System.out.println(l1);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);

        l1.setBeginXY(1, 1);
        l1.setEndXY(4, 6);
        System.out.println(l1);

        System.out.println();

        System.out.println(l2.getBegin());
        System.out.println(l1.getEndX());

        System.out.println();

        System.out.println(l2.getGradient());
        System.out.println(l1.getLength());
    }
}
