package baitap41;

public class Cylinder extends Circle {
    // Private instance variable
    private double height = 1.0;

    // No-arg constructor
    public Cylinder() {
        super(); // calls Circle()
    }

    // Constructor with radius
    public Cylinder(double radius) {
        super(radius);
    }

    // Constructor with radius and height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Constructor with radius, height, and color
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter and setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Compute volume (base area * height)
    public double getVolume() {
        return getArea() * height;
    }

    // Override toString
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}
