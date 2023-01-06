package lab6.person;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("Nguyen_Van_A", "Han_noi");
        System.out.println(person);

        Student student = new Student("Nguyen_Van_A", "Han_noi", "B1", 20, 2000);
        System.out.println(student);
        if (student instanceof Person) {
            System.out.println((Person) student);
        }
        Staff staff = new Staff("Nguyen_Van_A", "Han_noi", "Nguyen_Trai", 2000);
        System.out.println(staff);
        Person person1 = new Student("Nguyen_Van_B", "Ha_Noi", "B2", 20, 2000);
        System.out.println(person1);

        if (person1 instanceof Student) {
            System.out.println((Student) person1);
        }
    }

}
