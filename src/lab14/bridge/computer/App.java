package lab14.bridge.computer;

public class App {
    public static void main(String[] args) {
        OperatingSystem macOS = new MacOS();
        OperatingSystem windowsOS = new WindowsOS();

        Computer laptop1 = new Laptop(macOS);
        laptop1.startup();
        laptop1.browselntemet("pattern");
        System.out.println();
        Computer laptop2 = new Laptop(windowsOS);
        laptop2.startup();
        laptop2.browselntemet("pattern");
        System.out.println();
        Computer pc1 = new PC(windowsOS);
        pc1.startup();
        pc1.browselntemet("Pattern");
        System.out.println();
        Computer pc2 = new PC(macOS);
        pc2.startup();
    }
}
