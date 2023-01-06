package lab12.observerex;

public class OctalObserver extends Observer {
    private String octal;

    public OctalObserver(Subject subject) {
        super(subject);
        subject.attact(this);
    }

    @Override
    public void update() {
        this.octal = convertDecimalToOvtal(this.subject.getState());
    }

    private String convertDecimalToOvtal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    @Override
    public String toString() {
        return this.octal;
    }
}
