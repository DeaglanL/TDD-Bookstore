package BookStore.rest;

import BookStore.BookStore;
import BookStore.model.Book;


import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Path("/bookstore")
public class BookEndPoint {

    Gson gson = new GsonBuilder().create();

    @Inject
    private BookStore bookService;

    @GET
    @Path("/json")
    @Produces({ "application/json" })
    public String getBooksAsJson() {
        return bookService.getAllBook();
    }

    @POST
    @Path("/json")
    @Produces({ "application/json" })
    public String  addNewBookToMap(String bookJson) {
        bookService.addBook(gson.fromJson(bookJson,Book.class));
        return "book added";
    }
/*
    @PUT
    @Path("/json/{id}")
    @Produces({ "application/json" })
    public String replaceBookFromBookStore(@PathParam("id") Integer id, String bookJson) {
        bookService.replaceBook(id, gson.fromJson(bookJson,Book.class));
        return b

    }
    */

    @DELETE
    @Path("/json/{id}")
    @Produces({ "application/json" })
    public String deleteBookFromBookStore(@PathParam("id") Integer id) {
        bookService.removeByID((long)id);
        return "Book removed";
    }

}
