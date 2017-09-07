package Tests;

import BookStore.BookStore;
import org.junit.*;


public class BookStoreTest {

    BookStore store;

    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {
        store = new BookStore();
        store.addBook(0, "Dmitry Glukhovsky", "Metro 2033", "Post-apocalyptic");

    }

    @Test
    public void addBookTest(){
        Assert.assertEquals("Should have added a book", store.content.get(0).getTitle(),"Metro 2033" );

    }

    @Test
    public void removeBookTest(){

        Assert.assertEquals("Should remove the right book", store.removeByID(0).getTitle(),"Metro 2033" );
       Assert.assertTrue("Should remove book", store.content.isEmpty());

    }

    @Test
    public void getGenreAmountTest(){
       Assert.assertEquals("Should return the number of books from a given genre", store.getGenreAmount("Post-apocalyptic"),1);
    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {

    }

}

