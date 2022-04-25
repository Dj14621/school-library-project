package books;

public class Book {
    //Fields

    private String title;
    private Integer bookID;
    private  double price;
    private String author;

    //Constructor


    public Book(String title, Integer bookID, double price, String author) {
        this.title = title;
        this.bookID = bookID;
        this.price = price;
        this.author = author;
    }

    //Getters and setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Methods
    public String getBookSize() {
        return "Medium";
    }
    public Integer getBookTotal() {
        return 2144;
    }

    //ToString


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookID=" + bookID +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
