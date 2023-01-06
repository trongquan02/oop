package lab12.guifactory;

public class App {
    private static Application configureApplication(String type) {
        Application app;
        GUIFactory factory;
        if (type.equals("MacOS")) {
            factory = new MacOSFactory();
        } else if (type.equals("Windown")) {
            factory = new WindownsFactory();
        } else {
            return null;
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application macOS = configureApplication("MacOS");
        macOS.paint();
        Application windown = configureApplication("Windown");
        windown.paint();

    }
}
