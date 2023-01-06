package lab5.mylineandmypoint;

public class TestMain {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1);
        MyPoint begin = new MyPoint(2, 4);
        MyPoint end = new MyPoint();
        MyLine line2 = new MyLine(begin, end);
        System.out.println(line2);

        System.out.println("Begin: " + line1.getBegin());
        line1.setBegin(begin);
        System.out.println("End: " + line1.getEnd());
        line1.setEnd(end);
        System.out.println(line1);

        System.out.println("BeginX: " + line1.getBeginX());
        line1.setBeginX(5);
        System.out.println("BeginY: " + line1.getBeginY());
        line1.setBeginY(3);
        System.out.println("EndX: " + line1.getEndX());
        line1.setEndX(7);
        System.out.println("EndY: " + line1.getEndY());
        line1.setEndY(1);
        System.out.println(line1);

        System.out.println(line1.getBeginXY()[0]);
        System.out.println(line1.getBeginXY()[1]);
        line1.setBeginXY(1, 2);
        System.out.println(line1.getEndXY()[0]);
        System.out.println(line1.getEndXY()[1]);
        line1.setEndXY(4, 6);
        System.out.println(line1);

        System.out.println("Distance: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());
    }
}
