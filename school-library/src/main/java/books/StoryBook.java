package books;

public class StoryBook extends Book {
    //Fields

    private String type;

    //Constructor

    public StoryBook(String title, Integer bookID, double price, String author, String type) {
        super(title, bookID, price, author);
        this.type = type;
    }


    //Getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //Methods
    public Integer getTotalPages(){
        return 299;
    }
}
