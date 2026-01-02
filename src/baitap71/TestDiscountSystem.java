package baitap71;

import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {

        Customer c1 = new Customer("Anna");
        c1.setMember(true);
        c1.setMemberType("Premium");

        Visit v1 = new Visit(c1, new Date());
        v1.setServiceExpense(100);
        v1.setProductExpense(50);

        System.out.println(v1);

        Customer c2 = new Customer("Bob");
        Visit v2 = new Visit(c2, new Date());
        v2.setServiceExpense(100);
        v2.setProductExpense(50);

        System.out.println(v2);
    }
}