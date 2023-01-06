package lab10.PhoneBook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student element : phoneBook) {
            if (element.name.equals(name)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student element : phoneBook) {
            if (element.lastName.equals(lastname)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(Student phone) {
        for (Student element : phoneBook) {
            if (element.phone.equals(phone)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public void deleteByNuber(String phone) {
        for (Student element : phoneBook) {
            if (element.phone.equals(phone)) {
                phoneBook.remove(element);
                break;
            }
        }
    }
}
