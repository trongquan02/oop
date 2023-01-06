package lab5.customerandaccount;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "An", 'm');
        System.out.println("ID: " + customer1.getID());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Gender: " + customer1.getGender());
        System.out.println(customer1.toString());

        Account account1 = new Account(2, customer1, 100);
        System.out.println(account1);

        account1.setBalance(200);
        System.out.println(account1);
        System.out.println("ID: " + account1.getID());
        System.out.println("Customer: " + account1.getCustomer());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Customer's name: " + account1.getCustomerName());
        System.out.println(account1.deposit(25));
        System.out.println(account1.withdraw(400));
    }
}

