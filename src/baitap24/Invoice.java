package baitap24;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    // Constructor
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    // Setters
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Derived getters
    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    // Calculate amount after discount
    public double getAmountAfterDiscount() {
        return amount * (1 - customer.getDiscount() / 100.0);
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Invoice[id=%d,customer=%s,amount=%.2f]",
                id, customer.toString(), amount);
    }
}
