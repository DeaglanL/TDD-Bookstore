package BookStore;

import BookStore.model.Book;

public interface BookStore {
    String  getAllBook();

    void populateBookStore();

    void addBook(Book book);

    Book removeByID(Long id);

    long getGenreAmount(String genre);

}
