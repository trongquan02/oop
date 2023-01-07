package lab7.animal;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Cat("QUANG_NAM");
        animal.greets();
        Animal animal1 = new Dog("cho");
        animal1.greets();
        Dog another = new Dog("cho1");
        ((Dog) animal1).greets(another);
        Dog dog1 = new BigDog("cho2");
        dog1.greets(another);
    }

}
