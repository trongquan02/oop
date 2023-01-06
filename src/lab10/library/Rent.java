package lab10.library;

import java.util.Date;

public class Rent {
    private Item item;
    private Date end;
    private Student student;
    private Date begin;

    public Rent(Item item, Student student, Date end, Date begin) {
        this.item = item;
        this.student = student;
        this.end = end;
        this.begin = begin;
    }

    public Item getItem() {
        return item;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getBegin() {
        return begin;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "item=" + item +
                ", end=" + end +
                ", student=" + student +
                ", begin=" + begin +
                '}';
    }
}
