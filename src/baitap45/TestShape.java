package baitap45;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("blue", false);
        System.out.println(s1);

        Circle c1 = new Circle(2.5, "green", true);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Square sq1 = new Square(5.0, "purple", true);
        System.out.println(sq1);
        System.out.println("Side: " + sq1.getSide());
        sq1.setSide(8.0);
        System.out.println("After setSide(8): " + sq1);
    }
}
