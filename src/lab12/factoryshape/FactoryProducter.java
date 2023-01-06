package lab12.factoryshape;

public class FactoryProducter {
    public AbstractFactory getFactory(String type) {
        if (type.equals("RoundedShape")) {
            return new RoundedShapeFactory();
        } else if (type.equals("Normal")) {
            return new ShapeFactory();
        }
        return null;
    }

}
