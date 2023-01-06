package lab10.polynomial;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = new double[coefficients.length];
        for (int i = 0; i < coefficients.length; i++) {
            this.coefficients[i] = coefficients[i];
        }
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] degreeDiff = new double[degree()];
        for (int i = 0; i < degreeDiff.length; i++) {
            if (coefficients[i + 1] == 0) {
                degreeDiff[i] = 0;
            } else {
                degreeDiff[i] = coefficients[(i + 1)] * (i + 1);
            }
        }


        Poly diff = new ArrayPoly(degreeDiff);
        return diff;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficient() {

        return coefficients;
    }
}
