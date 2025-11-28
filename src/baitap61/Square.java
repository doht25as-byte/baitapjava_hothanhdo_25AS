package baitap61;

public class Square extends Rectangle{
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, Boolean filled, double side){
        super(color,filled,side,side);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
