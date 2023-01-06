package lab5.mypolynomial;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println(polynomial1);
        System.out.println("evaluate is: " + polynomial1.evaluate(5.1));
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4);
    }

}
