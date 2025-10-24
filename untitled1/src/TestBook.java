public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("thanhdo","hothanhdo",'m');
        System.out.println(ahTeck);

        Book dummybook = new Book("Java for dummy ",ahTeck,19.9,99);
        System.out.println(dummybook);

        dummybook.setPrice(29.95);
        dummybook.setQty(28);
        System.out.println("name is: " + dummybook.getName());
        System.out.println("price is: " + dummybook.getPrice());
        System.out.println("qty is: " + dummybook.getQty());
        System.out.println("Author is: " + dummybook.getAuthor());
        System.out.println("Author's name is: " + dummybook.getAuthor().getName());
        System.out.println("Author's email is: " + dummybook.getAuthor().getEmai());

        Book anotherBook = new Book("more Java",
                new Author("thanhdo", "hothanhdo.com", 'm'), 29.95);
        System.out.println(anotherBook);



    }


}
