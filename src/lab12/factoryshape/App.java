package lab12.factoryshape;

public class App {
    public static void main(String[] args) {
        FactoryProducter factoryProducter = new FactoryProducter();
        AbstractFactory abstractFactory = factoryProducter.getFactory("Normal");
        Shape rectangle = abstractFactory.getShape("Rectangle");
        rectangle.draw();
        System.out.println();
        Shape square = abstractFactory.getShape("Square");
        square.draw();
    }
}
