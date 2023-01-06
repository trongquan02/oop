package lab11.strategy;

public class ConcreatwStrategySubtract implements Strategy {
    @Override
    public double excute(double a, double b) {
        return a - b;
    }
}
