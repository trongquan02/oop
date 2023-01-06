package lab5.employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary = (int) (salary * (1 + (double) percent / 100));
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("[id = ")
                .append(this.id)
                .append(", ")
                .append("name = ")
                .append(getName())
                .append(", ")
                .append("salary = ")
                .append(this.salary)
                .append("]");
        return description.toString();
    }
}
