package baitap36;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        System.out.println(ball);
        ball.move();
        System.out.println(ball);
        ball.reflectHorizontal();
        ball.move();
        System.out.println(ball);
    }
}