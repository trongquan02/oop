package lab6.point;

public class TestMain {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);
        System.out.println("X = " + point3D.getX());
        for (int i = 0; i < 3; i++) {
            System.out.println(point3D.getXYZ()[i]);
        }
        System.out.println();
        point3D.setXYZ(2, 4, 5);
        for (int i = 0; i < 3; i++) {
            System.out.println(point3D.getXYZ()[i]);
        }
    }


}
