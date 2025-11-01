package baitap28;

import baitap26.MyPoint;

public class TestMyCircle {
    public static void main(String[] args) {
        // Create circles using different constructors
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(3, 4, 5);
        MyCircle c3 = new MyCircle(new MyPoint(6, 8), 10);

        // Display circles
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Test getters and setters
        c1.setCenterXY(1, 2);
        c1.setRadius(3);
        System.out.println("Updated c1: " + c1);

        // Test calculations
        System.out.printf("Area of c2: %.2f%n", c2.getArea());
        System.out.printf("Circumference of c3: %.2f%n", c3.getCircumference());

        // Test distance between centers
        System.out.printf("Distance between c1 and c2: %.2f%n", c1.distance(c2));
    }
}
