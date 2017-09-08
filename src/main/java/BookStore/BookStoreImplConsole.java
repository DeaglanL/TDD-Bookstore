package BookStore;

import java.util.HashMap;
import java.util.Map;
import BookStore.model.*;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;


@Stateless
@Default
public class BookStoreImplConsole implements BookStore {

    public Map<Long, Book> content = new HashMap<Long, Book>();

    @Override
    public String getAllBook() {
        return null;
    }

    public void populateBookStore(Book[] books){
        for (Book b: books) {
            content.put(b.getId(),b);
        }

    }

    public void addBook(Book book){
        content.put(book.getId(), book);
    }

    public Book removeByID(Long id){
        Book b = content.get(id);
       content.remove(id);

       return b;
    }

    public long getGenreAmount(String genre)
    {
        return content.entrySet().stream().filter(eachBook -> eachBook.getValue().getGenre() == genre).count();
    }



}
