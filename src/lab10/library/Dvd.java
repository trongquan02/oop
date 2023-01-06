package lab10.library;

public class Dvd extends Item {
    private int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Dvd[" + "duration = " + duration + ", title = " + title
                + '\'' + ", year = " + year + "]";
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
