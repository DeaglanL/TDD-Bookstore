package BookStore;

import BookStore.model.Book;
import BookStore.util.JSONUtil;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Stateless
@Default
public class BookStoreImplJSON implements BookStore {

    public Map<Long, Book> content = new HashMap<Long, Book>();

    @Inject
    private JSONUtil util;



    public BookStoreImplJSON(){
        populateBookStore();
    }

    @Override
    public String getAllBook() {
        return util.getJSONForObject(content.values());
    }

    public void populateBookStore() {
        content.put((long)0, new Book(0, "Rick Riordan", "The Lightning Thief","fantasy"));
        content.put((long)1, new Book(1, "Jane Austen", "Pride and Prejudice","drama"));
        content.put((long)2, new Book(2, "Emily Bront", "Wuthering Heights","drama"));
        content.put((long)3, new Book(3, "Joseph Conrad", "Nostromo","drama"));
    }


    public void addBook(Book book) {
        content.put(book.getId(), book);
    }


    public Book removeByID(Long id) {
        return null;
    }


    public long getGenreAmount(String genre) {
        return 0;
    }
}
