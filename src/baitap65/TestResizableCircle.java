package baitap65;

public class TestResizableCircle {
    public static void main(String[] args) {

        ResizableCircle c = new ResizableCircle(10);

        System.out.println(c);
        System.out.println("Area = " + c.getArea());
        System.out.println("Perimeter = " + c.getPerimeter());

        c.resize(50); // giảm còn 50%

        System.out.println();
        System.out.println("After resize 50%");
        System.out.println(c);
        System.out.println("Area = " + c.getArea());
        System.out.println("Perimeter = " + c.getPerimeter());
    }
}
