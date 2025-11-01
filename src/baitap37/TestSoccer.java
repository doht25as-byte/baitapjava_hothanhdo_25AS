package baitap37;

public class TestSoccer {
    public static void main(String[] args) {
        // Create a ball
        Ball ball = new Ball(10.0f, 5.0f, 0.0f);
        System.out.println("Initial Ball: " + ball);

        // Create a player
        Player player1 = new Player(7, 12.0f, 7.0f);
        System.out.println(player1);

        // Move the player and jump
        player1.move(-1.0f, -1.0f);
        player1.jump(1.0f);
        System.out.println("After moving and jumping: " + player1);

        // Check if player is near the ball
        System.out.println("Is near ball? " + player1.near(ball));

        // Try to kick the ball
        player1.kick(ball);
        System.out.println("Ball after kick: " + ball);
    }
}