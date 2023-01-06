package lab5.customerandinvoice;

public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        StringBuilder deccription = new StringBuilder();
        deccription.append(this.name)
                .append("(")
                .append(this.id)
                .append(")(")
                .append(this.discount)
                .append("%)");
        return deccription.toString();
    }
}
