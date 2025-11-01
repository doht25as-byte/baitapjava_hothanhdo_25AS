package baitap15;

public class TestinvoiceItem {
    public static void main(String[] args) {
        // Test constructor and toString()
        invoiceItem inv1 = new invoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUintprice(0.99);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getTotal());
        System.out.println("qty is: " + inv1.getUintprice());
        System.out.println("unitPrice is: " + inv1.getUintprice());

        // Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }
}
