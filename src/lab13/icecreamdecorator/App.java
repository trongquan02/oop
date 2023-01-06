package lab13.icecreamdecorator;

public class App {
    public static void main(String[] args) {
        IceCream vanillaIceCream = new VanillalceCream();
        System.out.println(vanillaIceCream.getDescription());
        IceCream honey = new HoneyToppingDecoratoe(vanillaIceCream);
        System.out.println(honey.getDescription());
    }
}
