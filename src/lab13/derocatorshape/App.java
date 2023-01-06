package lab13.derocatorshape;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape redShapeDec = new RedShapeDecorator(circle);
        redShapeDec.draw();
    }
}
