package lab10.polynomial;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        return coefficient();
    }

    @Override
    public boolean equls(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        AbstractPoly poly = (AbstractPoly) o;
        if (degree() != poly.degree()) {
            return false;
        }
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != poly.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {

        return Objects.hashCode(coefficient());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
