package baitap44;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("Before move: " + m1);
        m1.move();
        System.out.println("After move: " + m1);
    }
}
