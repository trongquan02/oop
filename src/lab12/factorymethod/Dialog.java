package lab12.factorymethod;

public abstract class Dialog {
    public void renderWindows() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
