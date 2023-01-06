package lab14.bridge.computer;

public abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    public abstract void startup();

    public abstract void browselntemet(String url);

    public abstract boolean canMoveComputer();
}
