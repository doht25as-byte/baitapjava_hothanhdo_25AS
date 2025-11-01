package baitap37;

public class Player {
    // Instance variables
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;  // default

    // Constructor
    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    // Move the player horizontally
    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    // Make the player jump
    public void jump(float zDisp) {
        z += zDisp;
    }

    // Check if the player is near the ball
    public boolean near(Ball ball) {
        float dx = x - ball.getX();
        float dy = y - ball.getY();
        float dz = z - ball.getZ();
        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        return distance < 8;
    }

    // Kick the ball if near
    public void kick(Ball ball) {
        if (near(ball)) {
            // Example kick effect: move the ball upward and forward
            ball.setXYZ(ball.getX() + 5, ball.getY() + 5, ball.getZ() + 2);
            System.out.println("Player " + number + " kicks the ball!");
        } else {
            System.out.println("Player " + number + " is too far to kick.");
        }
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Player %d at (%.2f, %.2f, %.2f)", number, x, y, z);
    }
}

