package baitap23;

public class TestBook {
    public static void main(String[] args) {
        Author a1 = new Author("J.K. Rowling", "jk@hogwarts.com");
        Book b1 = new Book("9780439139601", "Harry Potter and the Goblet of Fire", a1, 39.95, 50);

        System.out.println(b1.toString());
        System.out.println("Author name: " + b1.getAuthorName());
    }
}
