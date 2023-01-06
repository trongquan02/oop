package lab14.bridge.computer;

public class Laptop extends Computer {

    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        this.os.startup();
    }

    @Override
    public void browselntemet(String url) {
        this.os.loadUrl(url);
        System.out.println("Laptop browseing url: " + url);
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}
