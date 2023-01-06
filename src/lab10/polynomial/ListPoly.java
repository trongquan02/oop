package lab10.polynomial;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double element : coeffs) {
            coefficients.add(element);
        }
    }

    @Override
    public int degree() {
        return coefficients.size();
    }

    @Override
    public Poly derivative() {
        double[] degreeDiff = new double[degree() - 1];
        for (int i = 0; i < degreeDiff.length; i++) {
            if (coefficient()[i + 1] == 0) {
                degreeDiff[i] = 0;
            } else {
                degreeDiff[i] = coefficients.get(i + 1) * (i + 1);
            }
        }

        Poly diff = new ListPoly(degreeDiff);
        return diff;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.degree() - 1; i >= 0; i--) {
            description.append(coefficients.get(i))
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        description.delete(description.length() - 3, description.length());
        return description.toString();
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficient() {
        double[] arr = new double[coefficients.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = coefficients.get(i);
        }
        return arr;
    }
}
