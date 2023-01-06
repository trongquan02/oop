package lab12.observerex;

public class HexaObsercer extends Observer {
    private String hexa;

    public HexaObsercer(Subject subject) {
        super(subject);
        subject.attact(this);
    }

    @Override
    public void update() {
        this.hexa = convertDecimalToHexa(this.subject.getState());
    }

    private String convertDecimalToHexa(int decimal) {
        return Integer.toHexString(decimal);
    }

    @Override
    public String toString() {
        return this.hexa;
    }
}
