package BookStore;

import java.util.HashMap;
import java.util.Map;

public class BookStore {

    public Map<Integer,Book> content = new HashMap<Integer, Book>();

    public void addBook(int id, String author, String title, String genre){
        Book b = new Book(id,author,title,genre);
        content.put(id, b);
    }

    public Book removeByID(Integer id){
        Book b = content.get(id);
       content.remove(id);

       return b;
    }

    public long getGenreAmount(String genre)
    {
        return content.entrySet().stream().filter(eachBook -> eachBook.getValue().getGenre() == genre).count();
    }



}
