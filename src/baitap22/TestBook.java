package baitap22;

public class TestBook {
    public static void main(String[] args) {
        Author a1 = new Author("J.K. Rowling", "jk@hogwarts.com", 'f');
        Author a2 = new Author("Stephen King", "sk@horror.com", 'm');
        Author[] authors = {a1, a2};

        Book b1 = new Book("Magic & Mystery", authors, 29.95, 100);

        System.out.println(b1.toString());
        System.out.println("Author names: " + b1.getAuthorNames());
    }
}


