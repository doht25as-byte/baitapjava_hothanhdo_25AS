package baitap22;

public class Book {
    // Instance variables
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // Constructors
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    // toString method
    @Override
    public String toString() {
        StringBuilder authorsList = new StringBuilder();
        authorsList.append("{");
        for (int i = 0; i < authors.length; i++) {
            authorsList.append(authors[i].toString());
            if (i < authors.length - 1) authorsList.append(",");
        }
        authorsList.append("}");
        return String.format("Book[name=%s,authors=%s,price=%.2f,qty=%d]",
                name, authorsList.toString(), price, qty);
    }

    // Return a comma-separated list of author names
    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            names.append(authors[i].getName());
            if (i < authors.length - 1) names.append(",");
        }
        return names.toString();
    }
}
