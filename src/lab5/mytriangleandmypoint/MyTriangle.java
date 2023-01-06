package lab5.mytriangleandmypoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=(" + v1 + "), v2=(" + v2 + "), v3=(" + v3 + ")]";
    }

    public double getPerimeter() {
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);
        double perimeter = (a + b + c) / 2;

        return perimeter;
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);
        if (a == b && a == c && b == c) {
            return "Equilateral";
        } else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
