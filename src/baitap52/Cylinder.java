package baitap52;

public class Cylinder {
    private Circle base;  // composition: cylinder HAS-A circle
    private double height;

    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height, String color) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public String getColor() {
        return base.getColor();
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getSurfaceArea() {
        double r = base.getRadius();
        return 2 * Math.PI * r * (r + height);
    }
}