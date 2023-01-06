package lab12.observerex;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObsercer hexaObsercer = new HexaObsercer(subject);

        System.out.println("Convert decimal 1234.");
        subject.setState(1234);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);

        System.out.println("Convert decimal 56789.");
        subject.setState(56789);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);

    }
}
