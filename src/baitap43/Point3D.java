package baitap43;

public class Point3D extends Point2D {
    // Instance variable
    private float z = 0.0f;

    // Constructors
    public Point3D() {
        super();
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // Getter and setter
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Override methods
    @Override
    public void setXY(float x, float y) {
        super.setXY(x, y);
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    @Override
    public float[] getXY() {
        return new float[] { getX(), getY() };
    }

    public float[] getXYZ() {
        return new float[] { getX(), getY(), z };
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}