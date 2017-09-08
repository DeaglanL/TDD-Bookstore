package BookStore;

import java.util.HashMap;
import java.util.Map;
import BookStore.model.*;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

@ApplicationScoped
@Alternative
public class BookStoreImplConsole implements BookStore {

    public Map<Long, Book> content = new HashMap<Long, Book>();

    @Override
    public String getAllBook() {
        return null;
    }

    public void populateBookStore(){
        content.put((long)0, new Book(0, "Rick Riordan", "The Lightning Thief","fantasy"));
        content.put((long)1, new Book(1, "Jane Austen", "Pride and Prejudice","drama"));
        content.put((long)2, new Book(2, "Emily Bront", "Wuthering Heights","drama"));
        content.put((long)3, new Book(3, "Joseph Conrad", "Nostromo","drama"));
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
