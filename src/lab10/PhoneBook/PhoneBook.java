package lab10.PhoneBook;

public interface PhoneBook {
    void addPerson(Student p);

    Student searchByName(String name);

    Student searchByLastname(String lastname);

    Student searchByNumber(Student phone);

    void deleteByNuber(String phone);

}
