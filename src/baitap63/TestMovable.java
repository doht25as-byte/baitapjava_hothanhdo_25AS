package baitap63;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(5, 5, 2, 3);

        System.out.println(p);

        p.moveUp();
        System.out.println("After moveUp: " + p);

        p.moveRight();
        System.out.println("After moveRight: " + p);

        p.moveDown();
        System.out.println("After moveDown: " + p);

        p.moveLeft();
        System.out.println("After moveLeft: " + p);
    }
}
