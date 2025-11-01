package baitap36;

public class Container {
    // Instance variables
    private int x1, y1, x2, y2; // top-left and bottom-right corners

    // Constructor
    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    // Getters
    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1 + 1;
    }

    public int getHeight() {
        return y2 - y1 + 1;
    }

    // Check if the ball collides with the container walls
    public boolean collides(Ball ball) {
        boolean collided = false;

        // Check left or right walls
        if ((ball.getX() - ball.getRadius()) <= x1 ||
                (ball.getX() + ball.getRadius()) >= x2) {
            ball.reflectHorizontal();
            collided = true;
        }

        // Check top or bottom walls
        if ((ball.getY() - ball.getRadius()) <= y1 ||
                (ball.getY() + ball.getRadius()) >= y2) {
            ball.reflectVertical();
            collided = true;
        }

        return collided;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Container[(%d,%d),(%d,%d)]", x1, y1, x2, y2);
    }
}