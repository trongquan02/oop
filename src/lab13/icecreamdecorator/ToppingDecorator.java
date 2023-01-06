package lab13.icecreamdecorator;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDecripion() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();
}
