package lab5.complexnumber;

public class TestMain {
    public static void main(String[] args) {
        MyComplex number1 = new MyComplex(1.1, 2.2);
        MyComplex number2 = new MyComplex(3.3, 4.4);
        System.out.println("Number1 is: " + number1);
        if (!number1.isReal()) {
            System.out.println(number1 + " is Not pure real number");
        }
        if (!number1.isImaginary()) {
            System.out.println(number1 + " is Not pure imaginary number");
        }
        if (!number1.equals(number2)) {
            System.out.println("(" + number1 + ") is Not equal to (" + number2 + ")");
        }
        System.out.println("(" + number1 + ") + (" + number2 + ") = (" + number1.addNew(number2) + ")");
    }

}
