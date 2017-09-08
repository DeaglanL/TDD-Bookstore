package BookStore;

import BookStore.model.Book;

public interface BookStore {
    String  getAllBook();

    void populateBookStore(Book[] books);

    void addBook(Book book);

    Book removeByID(Long id);

    long getGenreAmount(String genre);

}
