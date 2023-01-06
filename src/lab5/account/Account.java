package lab5.account;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // chuyen vao
    public int credit(int amount) {
        return balance = balance + amount;
    }

    // r ra
    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // ch v tk khac
    public int transferTo(Account another, int amount) {
        if (amount < balance) {
            balance = balance - amount;
            another.balance = another.balance + amount;
        }
        return balance;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("[")
                .append("id = ")
                .append(this.id)
                .append(", name = ")
                .append(this.name)
                .append(", balance = ")
                .append(this.balance)
                .append("]");
        return description.toString();
    }
}
