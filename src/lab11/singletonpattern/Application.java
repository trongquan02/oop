package lab11.singletonpattern;

public class Application {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        System.out.println(db1);
        Database db2 = Database.getInstance();
        System.out.println(db2);
    }
}
