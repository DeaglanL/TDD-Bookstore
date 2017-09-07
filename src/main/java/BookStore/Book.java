package BookStore;



public class Book {
    private  int id;
    private String author;
    private String title;
    private String genre;

    public Book(int id, String author, String title, String genre){
        this.id = id;
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
