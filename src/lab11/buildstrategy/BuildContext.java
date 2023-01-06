package lab11.buildstrategy;

public class BuildContext {
    private Strategy strategy;

    public BuildContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String location) {
        return strategy.build(location);
    }
}
