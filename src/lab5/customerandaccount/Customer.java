package lab5.customerandaccount;

public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append(this.name)
                .append("(")
                .append(this.ID)
                .append(")");
        return description.toString();
    }
}
