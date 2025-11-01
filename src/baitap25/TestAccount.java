package baitap25;

public class TestAccount {
    public static void main(String[] args) {
        // Create a customer
        Customer c1 = new Customer(101, "Alice", 'f');
        System.out.println(c1); // Expected: Alice(101)
        System.out.println("Gender: " + c1.getGender());

        // Create an account
        Account a1 = new Account(2001, c1, 1000.0);
        System.out.println(a1); // Expected: Alice(101) balance=$1000.00

        // Deposit money
        a1.deposit(500.0);
        System.out.println("After deposit: " + a1);

        // Withdraw money
        a1.withdraw(300.0);
        System.out.println("After withdrawal: " + a1);

        // Attempt to overdraw
        a1.withdraw(2000.0);

        // Display customer name from Account
        System.out.println("Customer name from account: " + a1.getCustomerName());
    }
}
