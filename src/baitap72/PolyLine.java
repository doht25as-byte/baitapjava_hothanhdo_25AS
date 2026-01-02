package baitap72;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {

    private List<Point> points;

    // Default constructor
    public PolyLine() {
        points = new ArrayList<>();
    }

    // Constructor with list of points
    public PolyLine(List<Point> points) {
        this.points = points;
    }

    // Append a point (x, y)
    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    // Append a Point object
    public void appendPoint(Point point) {
        points.add(point);
    }

    // Return {(x1,y1),(x2,y2),...}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    // Return total length of polyline
    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).distance(points.get(i + 1));
        }
        return length;
    }
}
