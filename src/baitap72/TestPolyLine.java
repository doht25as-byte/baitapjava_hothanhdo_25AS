package baitap72;

public class TestPolyLine {
    public static void main(String[] args) {

        PolyLine pl = new PolyLine();

        pl.appendPoint(1, 1);
        pl.appendPoint(2, 3);
        pl.appendPoint(new Point(5, 6));

        System.out.println(pl);               // {(1,1),(2,3),(5,6)}
        System.out.println("Length = " + pl.getLength());
    }
}
