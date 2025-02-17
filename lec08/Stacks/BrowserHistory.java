import java.util.Stack; //import the stack data structure (FILO)

public class BrowserHistory {
    private Stack<String> stack;

    public BrowserHistory() {
        stack = new Stack<String>();
    }

    public void click(String webpage) {
        stack.push(webpage);
    }

    public String back() {
        stack.pop();
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BrowserHistory b = new BrowserHistory();

        b.click("yahoo.com");
        b.click("yahoo.com/news/2024elections");
        b.click("wikipedia.com/donaldTrump");

        String curWebpage = b.back();
        System.out.println(curWebpage); //what will this print?

        String backAgain = b.back();
        System.out.println(backAgain); //what will this print?

        String backAgainAgain = b.back(); //what will this print?
        System.out.println(backAgainAgain);

    }
}
