package lab6.animal;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Quang_Nam");
        System.out.println(animal);
        Mammal mammal = new Mammal("Quang_Nam");
        System.out.println(mammal);
        Cat cat = new Cat("Quang_Nam");
        cat.greets();
        Dog dog = new Dog("Cho");
        Dog dog1 = new Dog("dog");
        System.out.println(dog);
        dog.greets();
        dog.greets(dog1);

        Mammal mammal1 = new Dog("kaka");
        if (mammal1 instanceof Dog)
            System.out.println((Dog) mammal1);
    }

}
