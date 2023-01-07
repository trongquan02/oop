package lab12.factorymethod;

public class App {
    private static Dialog dialog;

    public static void main(String[] args) {
//        configure();
//        runBusinessLogic();
        Dialog dialog1;
        String dialog = "html";
        if (dialog.equals("html")) {
            HtmlDialog a = new HtmlDialog();
            a.renderWindows();
        }

    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindows();
    }
}
