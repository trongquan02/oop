package lab10.polynomial;

public interface Poly {
    int degree();

    Poly derivative();

    double coefficient(int degree);

    double[] coefficient();

    boolean equls(Object o);
}
