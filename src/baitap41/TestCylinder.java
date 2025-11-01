package baitap41;

public class TestCylinder {
    public static void main(String[] args) {
        // Test constructors
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(2.5);
        Cylinder c3 = new Cylinder(2.5, 5.0);
        Cylinder c4 = new Cylinder(3.0, 7.0, "blue");

        // Display information
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println();

        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Volume: " + c2.getVolume());
        System.out.println();

        System.out.println(c3);
        System.out.println("Area: " + c3.getArea());
        System.out.println("Volume: " + c3.getVolume());
        System.out.println();

        System.out.println(c4);
        System.out.println("Area: " + c4.getArea());
        System.out.println("Volume: " + c4.getVolume());
    }
}
