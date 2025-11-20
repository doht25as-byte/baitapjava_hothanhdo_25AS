package baitap52;

public class TestCylinder {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println("=== CYLINDER DEFAULT ===");
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Color  = " + c1.getColor());
        System.out.println("Height = " + c1.getHeight());
        System.out.println("Volume = " + c1.getVolume());
        System.out.println("Surface Area = " + c1.getSurfaceArea());

        System.out.println();

        Cylinder c2 = new Cylinder(2.5, 5.0, "blue");
        System.out.println("=== CYLINDER CUSTOM ===");
        System.out.println("Radius = " + c2.getRadius());
        System.out.println("Color  = " + c2.getColor());
        System.out.println("Height = " + c2.getHeight());
        System.out.println("Volume = " + c2.getVolume());
        System.out.println("Surface Area = " + c2.getSurfaceArea());
    }
}