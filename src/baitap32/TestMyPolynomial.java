package baitap32;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.0, 2.0, 3.0);  // 3x^2 + 2x + 1
        MyPolynomial p2 = new MyPolynomial(2.0, 0.0, 1.0);  // x^2 + 2

        System.out.println("p1(x) = " + p1);
        System.out.println("p2(x) = " + p2);

        System.out.println("p1 degree = " + p1.getDegree());
        System.out.println("p1(2) = " + p1.evaluate(2));

        MyPolynomial sum = p1.add(p2);
        System.out.println("\nSum: " + sum);

        MyPolynomial product = p1.multiply(p2);
        System.out.println("Product: " + product);
    }
}
