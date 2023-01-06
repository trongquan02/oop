package lab6.animal;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Mammal[")
                .append(super.toString())
                .append("]");
        return description.toString();
    }
}
