package baitap61;

public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.toString());
        Rectangle r1 = new Rectangle();
        System.out.println(r1.length);
        System.out.println(r1.width);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        r1.setLength(10);
        r1.setWidth(8);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.getArea());
        Square s1 = new Square();
        System.out.println(s1.color);
        System.out.println(s1.filled);
        System.out.println(s1.length);
        System.out.println(s1.width);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());


            }
}
