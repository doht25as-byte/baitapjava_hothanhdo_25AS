package baitap29;

import baitap26.MyPoint;

public class MyTriangle {
    // Instance variables
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // Constructors
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

    // toString method
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    // Compute the perimeter
    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    // Determine the type of triangle
    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        final double EPSILON = 1E-6; // to handle floating-point rounding
        boolean s1s2 = Math.abs(side1 - side2) < EPSILON;
        boolean s2s3 = Math.abs(side2 - side3) < EPSILON;
        boolean s3s1 = Math.abs(side3 - side1) < EPSILON;

        if (s1s2 && s2s3) {
            return "Equilateral";
        } else if (s1s2 || s2s3 || s3s1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
