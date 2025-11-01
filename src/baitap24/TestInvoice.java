package baitap24;

public class TestInvoice {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Alice", 20);
        Invoice inv1 = new Invoice(1001, c1, 2500.0);

        System.out.println(inv1.toString());
        System.out.println("Customer name: " + inv1.getCustomerName());
        System.out.println("Amount after discount: " + inv1.getAmountAfterDiscount());
    }
}