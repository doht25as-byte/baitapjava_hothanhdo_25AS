package baitap36;

public class TestBallContainer {
    public static void main(String[] args) {
        Container box = new Container(0, 0, 100, 100);
        Ball ball = new Ball(50, 50, 5, 10, 45);
        System.out.println(box);
        System.out.println(ball);

        for (int i = 0; i < 10; i++) {
            ball.move();
            box.collides(ball);
            System.out.println(ball);
        }
    }
}