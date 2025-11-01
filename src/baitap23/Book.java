package baitap23;

public class Book {
    // Instance variables
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    // Constructors
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Return the author's name
    public String getAuthorName() {
        return author.getName();
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Book[isbn=%s,name=%s,%s,price=%.2f,qty=%d]",
                isbn, name, author.toString(), price, qty);
    }
}
