public class Main {
    public static void main(String[] args) {
        Account a1= new Account("a101", "Do", 9999);
        System.out.println(a1);
        Account a2 = new Account("a102","Duc");
        System.out.println(a2);

        System.out.println("ID:" +a1.getid());
        System.out.println("Name: "+a1.getName());
        System.out.println("Balance:" +a1.getBalance());

        a1.credit(1000);
        System.out.println(a1.getBalance());
        a1.debit(10000);
        System.out.println(a1);
        a1.debit(10000);
        System.out.println(a1);
        a1.transferTo(a2,900);
        System.out.println(a1);
        System.out.println(a2);
        a2.transferTo(a1,1);
        System.out.println(a1);
        System.out.println(a2);
        a2.debit()

    }


}



