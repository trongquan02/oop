package lab14.bridge.computer;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Windowsos starting os");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Windowsos loading url: " + url);
    }
}
