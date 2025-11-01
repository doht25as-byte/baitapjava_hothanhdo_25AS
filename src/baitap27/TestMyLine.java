package baitap27;

import baitap26.MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        // Create a line using coordinates
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1);
        System.out.printf("Length: %.2f%n", line1.getLength());
        System.out.printf("Gradient (radians): %.2f%n", line1.getGradient());

        // Create a line using MyPoint objects
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);

        // Test getters and setters
        line2.setBeginXY(2, 2);
        line2.setEndXY(5, 6);
        System.out.println("After moving points: " + line2);
        System.out.printf("New length: %.2f%n", line2.getLength());
    }
}

