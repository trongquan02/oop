package lab5.employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee);
        employee.setSalary(999);
        System.out.println(employee);
        System.out.println("id is: " + employee.getId());
        System.out.println("firstname is: " + employee.getFirstName());
        System.out.println("lastname is: " + employee.getLastName());
        System.out.println("salary is: " + employee.getSalary());
        System.out.println("name is: " + employee.getName());
        System.out.println("annual salary is: " + employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee);
    }
}
