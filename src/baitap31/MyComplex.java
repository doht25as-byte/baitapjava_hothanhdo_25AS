package baitap31;

public class MyComplex {
    // Instance variables
    private double real = 0.0;
    private double imag = 0.0;

    // Constructors
    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters and setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // toString
    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }

    // Checkers
    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        final double EPSILON = 1E-9;
        return Math.abs(this.real - real) < EPSILON && Math.abs(this.imag - imag) < EPSILON;
    }

    public boolean equals(MyComplex another) {
        final double EPSILON = 1E-9;
        return Math.abs(this.real - another.real) < EPSILON &&
                Math.abs(this.imag - another.imag) < EPSILON;
    }

    // Magnitude (modulus)
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Add right into this instance (mutates this)
    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    // Add this and right into a new instance (does not mutate)
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
}

