package Tests;

import ExamplePackage.ExampleClass;
import org.junit.*;


public class ExampleTestSuite {

    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {

    }

    @Test
    public void exampleTest(){
        ExampleClass ec = new ExampleClass();

        Assert.assertEquals(ec.TestMe(), "TestMe");
    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {

    }

}

