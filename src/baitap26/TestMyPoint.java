package baitap26;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(); // (0,0)
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println("p1: " + p1); // (0,0)
        System.out.println("p2: " + p2); // (3,4)

        // Test getXY()
        int[] coords = p2.getXY();
        System.out.println("p2 coordinates: (" + coords[0] + "," + coords[1] + ")");

        // Test distance methods
        System.out.println("Distance from p2 to (0,0): " + p2.distance());
        System.out.println("Distance from p2 to (3,4): " + p2.distance(3, 4));
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));

        // Test setXY
        p1.setXY(1, 1);
        System.out.println("After setXY, p1: " + p1);
    }
}

