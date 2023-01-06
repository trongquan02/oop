package lab14.bridge.computer;

public class PC extends Computer {

    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        this.os.startup();
    }

    @Override
    public void browselntemet(String url) {
        this.os.loadUrl(url);
        System.out.println("PC browseing url: " + url);
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}
