package baitap31;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.1, 4.05);
        MyComplex c2 = new MyComplex(1.9, -2.05);
        MyComplex c3 = new MyComplex(3.1, 4.05);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("c1 is real? " + c1.isReal());
        System.out.println("c2 is imaginary? " + c2.isImaginary());

        System.out.println("c1 equals (3.1,4.05)? " + c1.equals(3.1, 4.05));
        System.out.println("c1 equals c3? " + c1.equals(c3));

        System.out.println("Magnitude of c1: " + c1.magnitude());

        // Test addition (in-place)
        MyComplex temp = new MyComplex(2.0, 1.0);
        System.out.println("\nBefore addInto: " + temp);
        temp.addInto(c1);
        System.out.println("After addInto: " + temp);

        // Test addition (new object)
        MyComplex sum = c1.addNew(c2);
        System.out.println("\nNew sum (c1 + c2): " + sum);
        System.out.println("Original c1 still: " + c1);
    }
}
