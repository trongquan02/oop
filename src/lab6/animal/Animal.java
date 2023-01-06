package lab6.animal;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Animal[name = ")
                .append(this.name)
                .append("]");
        return description.toString();
    }
}
