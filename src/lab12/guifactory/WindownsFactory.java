package lab12.guifactory;

public class WindownsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindownsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindownCheckbox();
    }
}
