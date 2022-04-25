package books;

public class Magazine extends Book{
    //Fields
    private String type;
    private Integer year;

    //Constructors

    public Magazine(String title, Integer bookID, double price, String author, String type, Integer year) {
        super(title, bookID, price, author);
        this.type = type;
        this.year = year;
    }


    //Methods

    //ToString


    @Override
    public String toString() {
        return "Magazine{" +
                "type='" + type + '\'' +
                ", year=" + year +
                '}';
    }
}
