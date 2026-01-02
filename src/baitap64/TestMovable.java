package baitap64;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        System.out.println(p);
        p.moveRight();
        p.moveDown();
        System.out.println("After moving point: " + p);

        System.out.println();

        MovableCircle c = new MovableCircle(5, 5, 2, 2, 10);
        System.out.println(c);
        c.moveLeft();
        c.moveUp();
        System.out.println("After moving circle: " + c);
    }
}
