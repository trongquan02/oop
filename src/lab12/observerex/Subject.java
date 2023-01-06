package lab12.observerex;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observer;
    private int state;

    public Subject() {
        observer = new LinkedList<>();
        this.state = 1;
    }

    public void setState(int state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        onStatechanged();
    }

    public int getState() {
        return state;
    }

    public void attact(Observer o) {
        observer.add(o);
    }

    public void notifyAllOserver() {
        for (Observer o : observer) {
            o.update();
        }
    }

    private void onStatechanged() {
        notifyAllOserver();
    }
}
