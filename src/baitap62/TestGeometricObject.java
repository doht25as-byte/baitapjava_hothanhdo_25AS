package baitap62;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject circle = new Circle(3.5);
        GeometricObject rectangle = new Rectangle(4, 5);

        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());

        System.out.println();

        System.out.println(rectangle);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
    }
}
