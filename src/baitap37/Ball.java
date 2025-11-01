package baitap37;

public class Ball {
    // Instance variables
    private float x;
    private float y;
    private float z;

    // Constructor
    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    // Setter for all coordinates
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
