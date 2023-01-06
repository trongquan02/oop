package lab13.icecreamdecorator;

public class HoneyToppingDecoratoe extends ToppingDecorator {

    public HoneyToppingDecoratoe(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return "Honey";
    }
}
