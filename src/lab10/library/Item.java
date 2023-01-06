package lab10.library;

public abstract class Item {
    protected String title;
    protected int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item[" + "title = " + title + '\'' + ", year = " + year + ']';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
