package baitap29;

import baitap26.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        MyTriangle t2 = new MyTriangle(new MyPoint(1, 1), new MyPoint(4, 1), new MyPoint(2, 4));
        MyTriangle t3 = new MyTriangle(0, 0, 1, 1, 2, 2); // collinear points (degenerate)

        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Type: " + t1.getType());

        System.out.println();

        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Type: " + t2.getType());

        System.out.println();

        System.out.println(t3);
        System.out.println("Perimeter: " + t3.getPerimeter());
        System.out.println("Type: " + t3.getType());
    }
}