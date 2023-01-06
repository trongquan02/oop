package lab11.strategy;

public class ConcreatwStrategyMultiply implements Strategy {
    @Override
    public double excute(double a, double b) {
        return a * b;
    }
}
