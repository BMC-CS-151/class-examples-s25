import java.util.Queue; //import the queue data structure

//BIG DISCLAIMER: THIS WILL NOT ACTUALLY COMPILE AND RUN. IT IS CONCEPTUAL.

public class CashRegister {
    private Queue<String> q;

    public CashRegister() {
        q = new Queue<String>();
    }

    public void getInLine(String name) {
        q.enqueue(name);
    }

    public String checkout() {
        return q.dequeue();
    }


    public static void main(String[] args) {
        CashRegister cr = new CashRegister();

        cr.getInLine("Elizabeth");
        cr.getInLine("Dianna");

        String nextInLine = q.checkout();
        System.out.println("scanning " + nextInLine + "'s items"); //what will this print?

        cr.getInLine("Adam");

        nextInLine = q.checkout();
        System.out.println("scanning " + nextInLine + "'s items"); //what will this print?

    }
}
