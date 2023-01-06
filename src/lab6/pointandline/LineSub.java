package lab6.pointandline;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, Point end) {
        super(beginX, beginY);
        this.end = end;
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line[Begin " + super.toString() + ", End " + end.toString() + "]";
    }

    public Point getBegin() {

        return new Point(super.getX(), super.getY());
    }

    public Point getEnd() {

        return end;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {

        this.end = end;
    }

    public int getBeginX() {

        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int begin) {
        super.setX(begin);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public int getLength() {
        int xDiff = super.getX() - end.getX();
        int yDiff = super.getY() - end.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = super.getX() - end.getX();
        int yDiff = super.getY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
