package lab11.strategy;

public class Context {
    private Strategy strategy;

    public double execute(double a, double b) {
        return strategy.excute(a, b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
