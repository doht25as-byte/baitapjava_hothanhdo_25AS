package baitap32;

import java.util.Arrays;

public class MyPolynomial {
    // Instance variable
    private double[] coeffs; // coeffs[i] is coefficient for x^i

    // Constructor
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Return the degree (highest power)
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Convert polynomial to string in descending power form
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) continue;

            if (sb.length() > 0) {
                sb.append(coeffs[i] > 0 ? " + " : " - ");
            } else if (coeffs[i] < 0) {
                sb.append("-");
            }

            double absCoeff = Math.abs(coeffs[i]);
            if (i == 0) {
                sb.append(absCoeff);
            } else if (i == 1) {
                if (absCoeff != 1.0) sb.append(absCoeff);
                sb.append("x");
            } else {
                if (absCoeff != 1.0) sb.append(absCoeff);
                sb.append("x^").append(i);
            }
        }

        if (sb.length() == 0) sb.append("0");
        return sb.toString();
    }

    // Evaluate the polynomial for a given x
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    // Add two polynomials and return a new one
    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] sumCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double a = (i < this.coeffs.length) ? this.coeffs[i] : 0.0;
            double b = (i < right.coeffs.length) ? right.coeffs[i] : 0.0;
            sumCoeffs[i] = a + b;
        }
        return new MyPolynomial(sumCoeffs);
    }

    // Multiply two polynomials and return a new one
    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] productCoeffs = new double[newDegree + 1];
       Arrays.fill(productCoeffs, 0.0);

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                productCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(productCoeffs);
    }
}