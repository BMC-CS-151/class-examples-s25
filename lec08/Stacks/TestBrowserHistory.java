import org.junit.Test;
import static org.junit.Assert.*;

public class TestBrowserHistory {

    //use @test annotations

    @Test 
    public void testEmpty() {
        BrowserHistory b = new BrowserHistory();
        assertTrue(b.isEmpty());
    }

    @Test
    public void testClick() {
        BrowserHistory b = new BrowserHistory();
        b.click("yahoo");
        b.click("facebook");
        assertEquals("yahoo", b.back());
    }

    @Test
    public void testBack() {
        BrowserHistory b = new BrowserHistory();
        b.click("hello");
        try {
            b.back();
            assertTrue(false); //will never be reached if an exception occurs in line 27
        } catch (java.util.EmptyStackException e) {
            //correct;
        }

    }

    @Test
    public void brokenTest() {
        assertTrue(false);
    }

}
