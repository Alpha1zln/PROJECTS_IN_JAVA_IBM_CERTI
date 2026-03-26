package src;

// package src;

public class Book {
    private String title;
    private String author;
    private float price;

    public Book(String title2, String author2, float price2) {
        this.title = title2;
        this.author = author2;
        this.price = price2;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	public void setAuthor(String author) {
        this.author = author;
    }

	public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return "Title - " + this.title + "\nAuthor - "
            + this.author + "\nPrice - "+ String.format("%.2f", this.price);
    }
}
