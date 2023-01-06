package lab12.factoryshape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("Rectangle")) {
            return new RoundesRectangle();
        } else if (type.equals("Square")) {
            return new RoundedSquare();
        } else {
            return null;
        }
    }

}
