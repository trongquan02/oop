package lab10.PhoneBook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        this.phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.phone, p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student i : phoneBook.values()) {
            if (i.name.equals(name)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student i : phoneBook.values()) {
            if (i.lastName.equals(lastname)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(Student phone) {
        for (Student i : phoneBook.values()) {
            if (i.phone.equals(phone)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void deleteByNuber(String phone) {
        for (Student i : phoneBook.values()) {
            if (i.phone.equals(phone)) {
                phoneBook.remove(phone);
                break;
            }
        }
    }
}