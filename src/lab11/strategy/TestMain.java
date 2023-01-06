package lab11.strategy;

public class TestMain {
    public static void main(String[] args) {
        Context context = new Context();
        int action = 2;
        if (action == 1) {
            context.setStrategy(new ConcreatwStrategyAdd());
        } else if (action == 2) {
            context.setStrategy(new ConcreatwStrategySubtract());
        } else {
            context.setStrategy(new ConcreatwStrategyMultiply());
        }
        System.out.println(context.execute(2, 3));
    }
}
