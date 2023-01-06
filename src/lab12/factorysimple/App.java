package lab12.factorysimple;

public class App {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Apple apple = (Apple) fruitFactory.produceJuice("Apple");
        Fruit Banana = fruitFactory.produceJuice("Banana");
        apple.produceJuice();
        Banana.produceJuice();
    }
}
