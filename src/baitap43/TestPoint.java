package baitap43;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(3.5f, 2.0f);
        System.out.println("Point2D: " + p2);

        Point3D p3 = new Point3D(1.2f, 3.4f, 5.6f);
        System.out.println("Point3D: " + p3);

        p3.setXYZ(7.8f, 9.0f, 10.1f);
        System.out.println("After setXYZ: " + p3);
    }
}

