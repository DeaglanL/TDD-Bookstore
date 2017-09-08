package BookStore;

import BookStore.model.Book;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

@Stateless
@Default
public class BookStoreImplJSON implements BookStore {


    @Override
    public String getAllBook() {
        return null;
    }

    public void populateBookStore(Book[] books) {

    }


    public void addBook(Book book) {

    }


    public Book removeByID(Long id) {
        return null;
    }


    public long getGenreAmount(String genre) {
        return 0;
    }
}
